'use strict';

// 1. Botones de menú: sincronizamos la clase visual con aria-expanded.
function setupMenu(toggleId, panelId) {
  const toggle = document.getElementById(toggleId);
  const panel = document.getElementById(panelId);
  if (!toggle || !panel) return;

  const close = () => {
    toggle.setAttribute('aria-expanded', 'false');
    toggle.setAttribute('aria-label', 'Abrir menú');
    panel.classList.remove('is-open');
  };

  toggle.addEventListener('click', () => {
    const isOpen = toggle.getAttribute('aria-expanded') === 'true';
    toggle.setAttribute('aria-expanded', String(!isOpen));
    toggle.setAttribute('aria-label', isOpen ? 'Abrir menú' : 'Cerrar menú');
    panel.classList.toggle('is-open', !isOpen);
  });

  // Escape, clic fuera y selección de enlace cierran el menú.
  document.addEventListener('keydown', (event) => {
    if (event.key === 'Escape' && toggle.getAttribute('aria-expanded') === 'true') {
      close();
      toggle.focus();
    }
  });
  document.addEventListener('pointerdown', (event) => {
    if (!toggle.contains(event.target) && !panel.contains(event.target)) close();
  });
  panel.querySelectorAll('a').forEach((link) => link.addEventListener('click', close));
  return close;
}

const closeMobileMenu = setupMenu('mobileMenuToggle', 'mainNavigation');
setupMenu('demoMenuToggle', 'demoMenuPanel');

// El menú móvil vuelve a su estado inicial al pasar a escritorio.
const desktopQuery = window.matchMedia('(min-width: 781px)');
desktopQuery.addEventListener('change', (event) => {
  if (event.matches && closeMobileMenu) closeMobileMenu();
});

// 2. Ripple: calculamos las coordenadas relativas al botón, no a la página.
let rippleClicks = 0;
document.querySelectorAll('[data-ripple]').forEach((button) => {
  button.addEventListener('click', (event) => {
    const rect = button.getBoundingClientRect();
    const diameter = Math.max(rect.width, rect.height) * 2.25;
    // Un clic con teclado no tiene posición; por eso usamos el centro.
    const x = event.detail === 0 ? rect.width / 2 : event.clientX - rect.left;
    const y = event.detail === 0 ? rect.height / 2 : event.clientY - rect.top;
    const circle = document.createElement('span');
    circle.className = 'ripple-wave';
    circle.setAttribute('aria-hidden', 'true');
    circle.style.width = `${diameter}px`;
    circle.style.height = `${diameter}px`;
    circle.style.left = `${x - diameter / 2}px`;
    circle.style.top = `${y - diameter / 2}px`;
    button.appendChild(circle);
    circle.addEventListener('animationend', () => circle.remove(), { once: true });

    if (button.id === 'rippleDemoButton') {
      rippleClicks += 1;
      document.getElementById('rippleCount').textContent = `${rippleClicks} ${rippleClicks === 1 ? 'activación' : 'activaciones'}`;
    }
  });
});

// 3. Loader: el temporizador simula una tarea; no representa una carga real.
const loaderButton = document.getElementById('loaderButton');
const loaderStatus = document.getElementById('loaderStatus');
loaderButton.addEventListener('click', () => {
  loaderButton.disabled = true;
  loaderButton.textContent = 'Simulando...';
  loaderStatus.textContent = 'Proceso en curso...';
  loaderStatus.closest('.lab-preview').classList.remove('is-complete');
  window.setTimeout(() => {
    loaderStatus.textContent = 'Simulación completada';
    loaderButton.innerHTML = 'Repetir simulación <span aria-hidden="true">↗</span>';
    loaderButton.disabled = false;
    loaderStatus.closest('.lab-preview').classList.add('is-complete');
  }, 1800);
});

// 4. Tema: persistimos la preferencia sin depender de librerías.
const themeButton = document.getElementById('themeToggle');
const root = document.documentElement;
try {
  if (localStorage.getItem('motionlab-theme') === 'light') root.dataset.theme = 'light';
} catch (_) { /* El navegador puede bloquear el almacenamiento local. */ }
function updateThemeButton() {
  const light = root.dataset.theme === 'light';
  themeButton.setAttribute('aria-pressed', String(light));
  themeButton.setAttribute('aria-label', light ? 'Activar tema oscuro' : 'Activar tema claro');
  document.querySelector('meta[name="theme-color"]').content = light ? '#f2f7f6' : '#0b1115';
}
updateThemeButton();
themeButton.addEventListener('click', () => {
  root.dataset.theme = root.dataset.theme === 'light' ? 'dark' : 'light';
  updateThemeButton();
  try { localStorage.setItem('motionlab-theme', root.dataset.theme); } catch (_) { /* Opcional. */ }
});

// 5. Compatibilidad: si no existe animation-timeline, usamos IntersectionObserver.
const supportsViewTimeline = CSS.supports('animation-timeline: view()');
const supportsScrollTimeline = CSS.supports('animation-timeline: scroll()');
const reducedMotion = window.matchMedia('(prefers-reduced-motion: reduce)').matches;

if (!supportsViewTimeline && !reducedMotion && 'IntersectionObserver' in window) {
  root.classList.add('no-scroll-timeline');
  const observer = new IntersectionObserver((entries, currentObserver) => {
    entries.forEach((entry) => {
      if (entry.isIntersecting) {
        entry.target.classList.add('is-visible');
        currentObserver.unobserve(entry.target);
      }
    });
  }, { threshold: 0.08, rootMargin: '0px 0px 50px 0px' });
  document.querySelectorAll('.reveal').forEach((element) => observer.observe(element));
}

// Barra de lectura: JS interviene sin timeline CSS o al reducir movimiento.
if (!supportsScrollTimeline || reducedMotion) {
  const updateProgress = () => {
    const max = document.documentElement.scrollHeight - window.innerHeight;
    root.style.setProperty('--scroll-progress', String(max > 0 ? window.scrollY / max : 0));
  };
  window.addEventListener('scroll', updateProgress, { passive: true });
  window.addEventListener('resize', updateProgress);
  updateProgress();
}
