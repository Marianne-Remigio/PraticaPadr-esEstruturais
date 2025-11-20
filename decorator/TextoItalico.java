package org.example.decorator;

public class TextoItalico extends TextoDecorator {
    public TextoItalico(Texto texto) {
        super(texto);
    }

    @Override
    public String formata() {
        return "<i>" + textoDecorado.formata() + "</i>";
    }
}
