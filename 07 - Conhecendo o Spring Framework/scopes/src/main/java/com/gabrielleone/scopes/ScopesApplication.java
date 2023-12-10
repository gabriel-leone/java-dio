package com.gabrielleone.scopes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScopesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScopesApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) {
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
		};
	}
}
