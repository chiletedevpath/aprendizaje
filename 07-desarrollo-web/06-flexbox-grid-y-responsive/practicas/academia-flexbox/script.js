const alignItemsSelect = document.querySelector("#alignItemsSelect");
const alignContentSelect = document.querySelector("#alignContentSelect");
const liveDemo = document.querySelector("#liveDemo");
const liveCode = document.querySelector("#liveCode");

function updatePlayground() {
  const alignItems = alignItemsSelect.value;
  const alignContent = alignContentSelect.value;

  liveDemo.style.alignItems = alignItems;
  liveDemo.style.alignContent = alignContent;

  liveCode.textContent = `display: flex;
flex-wrap: wrap;
align-items: ${alignItems};
align-content: ${alignContent};`;
}

alignItemsSelect.addEventListener("change", updatePlayground);
alignContentSelect.addEventListener("change", updatePlayground);

updatePlayground();

const menuToggle = document.querySelector(".menu-toggle");
const mainNav = document.querySelector("#mainNav");

if (menuToggle && mainNav) {
  menuToggle.addEventListener("click", () => {
    const isOpen = mainNav.classList.toggle("is-open");

    menuToggle.classList.toggle("is-open", isOpen);
    menuToggle.setAttribute("aria-expanded", String(isOpen));
    menuToggle.setAttribute("aria-label", isOpen ? "Cerrar menú" : "Abrir menú");
  });

  mainNav.querySelectorAll("a").forEach((link) => {
    link.addEventListener("click", () => {
      mainNav.classList.remove("is-open");
      menuToggle.classList.remove("is-open");
      menuToggle.setAttribute("aria-expanded", "false");
      menuToggle.setAttribute("aria-label", "Abrir menú");
    });
  });

  window.addEventListener("resize", () => {
    if (window.innerWidth > 980) {
      mainNav.classList.remove("is-open");
      menuToggle.classList.remove("is-open");
      menuToggle.setAttribute("aria-expanded", "false");
      menuToggle.setAttribute("aria-label", "Abrir menú");
    }
  });
}
