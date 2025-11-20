package org.example.decorator;

public abstract class TextoDecorator implements Texto {
    protected Texto textoDecorado;

    public TextoDecorator(Texto texto) {
        this.textoDecorado = texto;
    }

    @Override
    public String formata() {
        return textoDecorado.formata();
    }
}

