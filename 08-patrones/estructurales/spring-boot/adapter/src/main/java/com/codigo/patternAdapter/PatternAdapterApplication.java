package com.codigo.patternAdapter;

import com.codigo.patternAdapter.ejemplo1.INotificador;
import com.codigo.patternAdapter.ejemplo1.ServicioMensajeriaExterno;
import com.codigo.patternAdapter.ejemplo1.MensajeriaAdapter;
import com.codigo.patternAdapter.ejemplo2.ExternalPaymentService;
import com.codigo.patternAdapter.ejemplo2.PaymentAdapter;
import com.codigo.patternAdapter.ejemplo2.PaymentResponse;
import com.codigo.patternAdapter.ejemplo2.PaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternAdapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternAdapterApplication.class, args);
		ServicioMensajeriaExterno appExterno = new ServicioMensajeriaExterno();

		INotificador notificador = new MensajeriaAdapter(appExterno);
		notificador.enviar("Hola Aprendiz DevPath, tu pedido fue confirmado");


		//Crear dependencias mnuales
		ExternalPaymentService externalPaymentService = new ExternalPaymentService();
		PaymentAdapter adapter =  new PaymentAdapter(externalPaymentService);

		PaymentService paymentService = new PaymentService(adapter);
		PaymentService paymentService1 = new PaymentService(adapter);
		PaymentResponse response = paymentService.getPayment();

		System.out.println(response);

	}

}
