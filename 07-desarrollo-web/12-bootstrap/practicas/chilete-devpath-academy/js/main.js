/* =========================================================
   JavaScript mínimo.
   Bootstrap controla Navbar y Modals.
========================================================= */


/* 1. Modal reutilizable de cursos */

const cursoModal =
  document.getElementById(
    "cursoModal"
  );

cursoModal.addEventListener(
  "show.bs.modal",
  (event) => {

    const button =
      event.relatedTarget;

    if (!button) {
      return;
    }

    document.getElementById(
      "cursoModalLabel"
    ).textContent =
      button.dataset.title;

    document.getElementById(
      "cursoModalNivel"
    ).textContent =
      button.dataset.level;

    document.getElementById(
      "cursoModalDescripcion"
    ).textContent =
      button.dataset.description;

    document.getElementById(
      "cursoModalDuracion"
    ).textContent =
      button.dataset.duration;

    document.getElementById(
      "cursoModalModalidad"
    ).textContent =
      button.dataset.modality;

    document.getElementById(
      "cursoModalHorario"
    ).textContent =
      button.dataset.schedule;

    const modalImage =
      document.getElementById(
        "cursoModalImagen"
      );

    modalImage.src =
      button.dataset.image;

    modalImage.alt =
      button.dataset.title;
  }
);


/* 2. Validación Bootstrap de formularios */

const forms =
  document.querySelectorAll(
    ".needs-validation"
  );

forms.forEach((form) => {

  form.addEventListener(
    "submit",
    (event) => {

      event.preventDefault();
      event.stopPropagation();

      if (!form.checkValidity()) {
        form.classList.add(
          "was-validated"
        );

        return;
      }

      form.classList.add(
        "was-validated"
      );

      if (
        form.id === "contactForm"
      ) {
        showSuccess(
          "contactSuccess",
          form
        );
      }

      if (
        form.id === "modalForm"
      ) {
        showSuccess(
          "modalSuccess",
          form
        );
      }
    }
  );
});


function showSuccess(
  alertId,
  form
) {

  const alert =
    document.getElementById(
      alertId
    );

  alert.classList.remove(
    "d-none"
  );

  form.reset();

  form.classList.remove(
    "was-validated"
  );

  setTimeout(() => {
    alert.classList.add(
      "d-none"
    );
  }, 4500);
}


/* 3. Cerrar Navbar en móvil */

const menuPrincipal =
  document.getElementById(
    "menuPrincipal"
  );

const navbarCollapse =
  bootstrap.Collapse.getOrCreateInstance(
    menuPrincipal,
    {
      toggle: false
    }
  );

document
  .querySelectorAll(
    "#menuPrincipal .nav-link"
  )
  .forEach((link) => {

    link.addEventListener(
      "click",
      () => {

        if (
          window.innerWidth < 992
        ) {
          navbarCollapse.hide();
        }
      }
    );
  });


/* 4. Fallback si una imagen externa falla */

const fallbackSvg = `
<svg
  xmlns="http://www.w3.org/2000/svg"
  width="1200"
  height="800"
  viewBox="0 0 1200 800"
>
  <rect
    width="1200"
    height="800"
    fill="#0b1020"
  />

  <text
    x="600"
    y="350"
    text-anchor="middle"
    font-family="Arial, sans-serif"
    font-size="78"
    font-weight="700"
    fill="#7dd3fc"
  >
    &lt;/&gt;
  </text>

  <text
    x="600"
    y="445"
    text-anchor="middle"
    font-family="Arial, sans-serif"
    font-size="42"
    font-weight="700"
    fill="#ffffff"
  >
    Chilete DevPath Academy
  </text>

  <text
    x="600"
    y="505"
    text-anchor="middle"
    font-family="Arial, sans-serif"
    font-size="26"
    fill="#94a3b8"
  >
    Desarrollo Web
  </text>
</svg>
`;

const fallbackData =
  "data:image/svg+xml;charset=UTF-8," +
  encodeURIComponent(
    fallbackSvg
  );


function applyImageFallback(
  image
) {

  if (
    image.dataset.fallbackApplied === "true"
  ) {
    return;
  }

  image.dataset.fallbackApplied =
    "true";

  image.src =
    fallbackData;

  image.classList.add(
    "image-fallback"
  );
}


document
  .querySelectorAll(
    ".external-image"
  )
  .forEach((image) => {

    image.addEventListener(
      "error",
      () => {
        applyImageFallback(
          image
        );
      }
    );
  });


/* El modal cambia la URL de la imagen;
   por eso también verificamos errores futuros. */

document
  .getElementById(
    "cursoModalImagen"
  )
  .addEventListener(
    "error",
    function () {

      applyImageFallback(
        this
      );
    }
  );
