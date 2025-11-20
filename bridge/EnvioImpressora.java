package org.example.bridge;

public class EnvioImpressora implements Envio {
    @Override
    public void enviar() {
        System.out.println("Imprimindo localmente...");
    }
}
