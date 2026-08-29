const menu = ["espresso", "cappuccino", "latte", "americano"];
const TIEMPO_SIMULADO_MS = 500;

function esperar() {
  return new Promise((resolve) => {
    setTimeout(resolve, TIEMPO_SIMULADO_MS);
  });
}

async function recibirPedido(producto) {
  await esperar();

  if (!menu.includes(producto)) {
    throw new Error(`El producto "${producto}" no está disponible`);
  }

  return {
    producto,
    estado: "recibido"
  };
}

async function prepararCafe(pedido, maquinaOperativa = true) {
  await esperar();

  if (!maquinaOperativa) {
    throw new Error("La máquina no está operativa");
  }

  return {
    ...pedido,
    estado: "preparado"
  };
}

async function procesarPedido(producto, maquinaOperativa = true) {
  console.log(`\nPedido solicitado: ${producto}`);

  try {
    const pedidoRecibido = await recibirPedido(producto);
    console.log(`Estado: ${pedidoRecibido.estado}`);

    const pedidoPreparado = await prepararCafe(pedidoRecibido, maquinaOperativa);
    console.log(`Estado: ${pedidoPreparado.estado}`);
    console.log(`Pedido entregado: ${pedidoPreparado.producto}`);
  } catch (error) {
    console.error(`Pedido cancelado: ${error.message}`);
  }
}

async function ejecutarCasosDePrueba() {
  await procesarPedido("latte");
  await procesarPedido("té helado");
  await procesarPedido("espresso", false);
}

ejecutarCasosDePrueba();
