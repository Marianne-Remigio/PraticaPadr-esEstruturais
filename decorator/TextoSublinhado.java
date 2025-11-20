package org.example.decorator;

public class TextoSublinhado extends TextoDecorator {
    public TextoSublinhado(Texto texto) {
        super(texto);
    }

    @Override
    public String formata() {
        return "<u>" + textoDecorado.formata() + "</u>";
    }
}
