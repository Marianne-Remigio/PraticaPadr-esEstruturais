package org.example.bridge;

public interface Envio {
    void enviar();
}

// Implementação concreta para Email
public class EnvioEmail implements Envio {
    @Override
    public void enviar() {
        System.out.println("Enviando por EMAIL...");
    }
}

