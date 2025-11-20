package org.example.bridge;

public abstract class NotaFiscal {
    protected Envio envio;

    public NotaFiscal(Envio envio) {
        this.envio = envio;
    }

    public abstract void emitir(String cliente, double valor);
}