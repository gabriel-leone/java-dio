package com.gabrielleone.primeirospassos;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int x, int y) {
        int resultado = x + y;
        return resultado;
    }
}
