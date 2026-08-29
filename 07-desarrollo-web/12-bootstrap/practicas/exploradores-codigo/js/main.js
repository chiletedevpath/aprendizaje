const worlds = [
  {
    id: "bosque-logico",
    name: "Bosque Lógico",
    symbol: "IF",
    level: "Inicial",
    description: "Un territorio para practicar decisiones, rutas alternativas y validación.",
    art: "linear-gradient(135deg, #064e3b, #2dd4bf)"
  },
  {
    id: "islas-datos",
    name: "Islas de Datos",
    symbol: "[]",
    level: "Básico",
    description: "Archipiélago dedicado a organizar, recorrer y transformar colecciones.",
    art: "linear-gradient(135deg, #1e3a8a, #38bdf8)"
  },
  {
    id: "ciudad-modular",
    name: "Ciudad Modular",
    symbol: "FN",
    level: "Intermedio",
    description: "Una ciudad donde cada función cumple una responsabilidad concreta.",
    art: "linear-gradient(135deg, #581c87, #c084fc)"
  },
  {
    id: "laboratorio-web",
    name: "Laboratorio Web",
    symbol: "DOM",
    level: "Intermedio",
    description: "Zona experimental para componentes, eventos y estados de interfaz.",
    art: "linear-gradient(135deg, #7c2d12, #fb923c)"
  },
  {
    id: "nube-despliegue",
    name: "Nube de Despliegue",
    symbol: "CI",
    level: "Avanzado",
    description: "Un destino futuro para aprender automatización y publicación responsable.",
    art: "linear-gradient(135deg, #334155, #94a3b8)"
  }
];

const worldGrid = document.querySelector("#worldGrid");
const selectedWorld = document.querySelector("#selectedWorld");
const modalElement = document.querySelector("#worldModal");
const modal = bootstrap.Modal.getOrCreateInstance(modalElement);

worlds.forEach((world, index) => {
  const column = document.createElement("div");
  column.className = "col-md-6 col-xl-4";
  column.innerHTML = `
    <article class="card world-card h-100 border-0 shadow-sm">
      <div class="world-art" style="--world-art: ${world.art}" aria-hidden="true">${world.symbol}</div>
      <div class="card-body p-4 d-flex flex-column">
        <span class="text-warning fw-bold">MUNDO ${String(index + 1).padStart(2, "0")}</span>
        <h3 class="h4 fw-bold mt-2">${world.name}</h3>
        <p class="text-secondary flex-grow-1">${world.description}</p>
        <button class="btn btn-outline-dark rounded-pill world-detail" data-world="${world.id}">
          Ver detalles
        </button>
      </div>
    </article>`;
  worldGrid.append(column);

  const option = document.createElement("option");
  option.value = world.id;
  option.textContent = world.name;
  selectedWorld.append(option);
});

worldGrid.addEventListener("click", (event) => {
  const button = event.target.closest(".world-detail");
  if (!button) return;

  const world = worlds.find((item) => item.id === button.dataset.world);
  document.querySelector("#worldModalTitle").textContent = world.name;
  document.querySelector("#worldModalDescription").textContent = `${world.description} Nivel: ${world.level}.`;
  document.querySelector("#modalArtwork").style.setProperty("--world-art", world.art);
  modal.show();
});

const form = document.querySelector("#registrationForm");
const formMessage = document.querySelector("#formMessage");

form.addEventListener("submit", (event) => {
  event.preventDefault();
  form.classList.add("was-validated");
  if (!form.checkValidity()) return;

  const name = document.querySelector("#studentName").value.trim();
  const world = worlds.find((item) => item.id === selectedWorld.value);
  formMessage.textContent = `${name}, tu exploración de ${world.name} quedó registrada solo en esta demostración.`;
  formMessage.classList.remove("d-none");
  form.reset();
  form.classList.remove("was-validated");
});

document.querySelectorAll("#menuPrincipal .nav-link").forEach((link) => {
  link.addEventListener("click", () => {
    const menu = bootstrap.Collapse.getInstance(document.querySelector("#menuPrincipal"));
    menu?.hide();
  });
});
