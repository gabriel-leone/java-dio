package com.gabrielleone.app;

import lombok.Data;
@Data
public class ViaCepResponse {
    private String cep;
    private String logradouro;
    private String localidade;

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
