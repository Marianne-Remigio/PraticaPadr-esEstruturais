package org.example.decorator;

public class TextoSimples implements Texto {
    private String conteudo;

    public TextoSimples(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String formata() {
        return conteudo;
    }
}
