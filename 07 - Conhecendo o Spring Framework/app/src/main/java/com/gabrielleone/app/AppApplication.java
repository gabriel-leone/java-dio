package com.gabrielleone.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.google.gson.Gson;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
		@Bean
		public CommandLineRunner run(ConversorJson conversor) throws Exception {
			return args -> {
				String json = "{\"cep\": \"01001-000\", \"logradouro\": \"Praça da Sé\", \"localidade\": \"01001-000\"}";
				ViaCepResponse response = conversor.converter(json);
				System.out.println("Dados do CEP: " + response);
			};
		}

		@Bean
		public Gson gson() {
			return new Gson();
		}
}
