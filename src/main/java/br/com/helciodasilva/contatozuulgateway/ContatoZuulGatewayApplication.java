package br.com.helciodasilva.contatozuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ContatoZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatoZuulGatewayApplication.class, args);
	}
}
