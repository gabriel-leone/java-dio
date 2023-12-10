package com.gabrielleone.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean
    public Remetente remetente() {
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@usp.br");
        remetente.setNome("Nome do NoReply");
        return remetente;
    }
}
