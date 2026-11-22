export function normalizar(texto) {
  return String(texto ?? "")
    .normalize("NFD")
    .replace(/[\u0300-\u036f]/g, "")
    .toLowerCase()
    .trim();
}

export function filtrarUsuarios(usuarios, termino) {
  const buscar = normalizar(termino);
  if (!buscar) return usuarios;

  return usuarios.filter((usuario) =>
    [usuario.name, usuario.username, usuario.email].some((campo) =>
      normalizar(campo).includes(buscar)
    )
  );
}

export function filtrarPostsPorInicial(posts, criterio) {
  const inicial = normalizar(criterio).charAt(0);
  if (!inicial) return [];

  return posts.filter((post) => normalizar(post.title).startsWith(inicial));
}
