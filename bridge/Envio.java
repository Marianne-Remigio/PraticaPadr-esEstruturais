package org.example.bridge;

public interface Envio {
    void enviar();
}

public class EnvioEmail implements Envio {
    @Override
    public void enviar() {
        System.out.println("Enviando por EMAIL...");
    }
}


