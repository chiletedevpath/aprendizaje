const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Ingrese su peso en kg: ", (pesoIngresado) => {
  rl.question("Ingrese su altura en metros: ", (alturaIngresada) => {
    const peso = Number.parseFloat(pesoIngresado);
    const altura = Number.parseFloat(alturaIngresada);

    if (!Number.isFinite(peso) || !Number.isFinite(altura) || peso <= 0 || altura <= 0) {
      console.error("El peso y la altura deben ser números mayores que cero.");
      rl.close();
      return;
    }

    const imc = peso / (altura * altura);
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

    console.log(`\nIMC: ${imc.toFixed(2)}`);
    console.log(`Clasificación: ${clasificacion}`);
    rl.close();
  });
});
