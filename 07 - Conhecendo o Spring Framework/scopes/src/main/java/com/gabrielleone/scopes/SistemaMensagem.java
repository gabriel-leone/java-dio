package com.gabrielleone.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente financeiro;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado!");
    }

    public void enviarMensagemBoasVindas() {
        financeiro.setEmail("gabriel.leone@usp.br");
        System.out.println(financeiro);
        System.out.println("Seja bem-vindo!");
    }
}
