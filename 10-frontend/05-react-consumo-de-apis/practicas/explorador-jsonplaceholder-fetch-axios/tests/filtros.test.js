import test from "node:test";
import assert from "node:assert/strict";

import {
  filtrarPostsPorInicial,
  filtrarUsuarios,
  normalizar
} from "../src/utils/filtros.js";

test("normalizar ignora mayúsculas, tildes y espacios externos", () => {
  assert.equal(normalizar("  ÁRBOL  "), "arbol");
});

test("filtrarUsuarios busca en nombre, usuario y correo", () => {
  const usuarios = [
    { name: "Ana Torres", username: "atorres", email: "ana@example.test" },
    { name: "Luis Rojas", username: "lrojas", email: "luis@example.test" },
  ];

  assert.deepEqual(filtrarUsuarios(usuarios, "TORRES"), [usuarios[0]]);
  assert.deepEqual(filtrarUsuarios(usuarios, "lrojas"), [usuarios[1]]);
});

test("filtrarPostsPorInicial usa solo la primera letra normalizada", () => {
  const posts = [
    { id: 1, title: "Árboles y caminos" },
    { id: 2, title: "Buenas prácticas" },
  ];

  assert.deepEqual(filtrarPostsPorInicial(posts, "a"), [posts[0]]);
  assert.deepEqual(filtrarPostsPorInicial(posts, "B"), [posts[1]]);
});
