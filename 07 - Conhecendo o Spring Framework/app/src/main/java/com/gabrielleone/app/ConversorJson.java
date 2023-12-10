package com.gabrielleone.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.google.gson.Gson;

@Component
public class ConversorJson {
    private final Gson gson;

    public ConversorJson(Gson gson) {
        this.gson = gson;
    }

    public ViaCepResponse converter(String json) {
        return gson.fromJson(json, ViaCepResponse.class);
    }
}
