// Entrada por consola
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Ingrese su peso en kg: ", (peso) => {
  rl.question("Ingrese su altura en metros: ", (altura) => {
    // Convertir a número
    peso = parseFloat(peso);
    altura = parseFloat(altura);

    if (!Number.isFinite(peso) || !Number.isFinite(altura) || peso <= 0 || altura <= 0) {
      console.error("El peso y la altura deben ser números mayores que cero.");
      rl.close();
      return;
    }

    // Calcular IMC
    const imc = peso / (altura * altura);

    // Clasificar IMC
    let clasificacion;

    if (imc < 18.5) {
      clasificacion = "Bajo peso";
    } else if (imc < 25) {
      clasificacion = "Normal";
    } else if (imc < 30) {
      clasificacion = "Sobrepeso";
    } else {
      clasificacion = "Obesidad";
    }

    // Mostrar resultado
    console.log("\nIMC: " + imc.toFixed(2));
    console.log("Clasificación: " + clasificacion);

    rl.close();
  });
});
