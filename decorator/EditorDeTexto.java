package org.example.decorator;

public class EditorDeTexto {
    public static void main(String[] args) {
        String conteudo = "Padrões de projeto.";

        Texto textoSimples = new TextoSimples(conteudo);
        System.out.println(textoSimples.formata());

        Texto textoNegrito = new TextoNegrito(new TextoSimples(conteudo));
        System.out.println(textoNegrito.formata());

        Texto textoItalico = new TextoItalico(new TextoSimples(conteudo));
        System.out.println(textoItalico.formata());

        Texto textoNegritoItalico = new TextoNegrito(new TextoItalico(new TextoSimples(conteudo)));
        System.out.println(textoNegritoItalico.formata());

        Texto textoNegritoSublinhado = new TextoNegrito(new TextoSublinhado(new TextoSimples(conteudo)));
        System.out.println(textoNegritoSublinhado.formata());

        Texto textoTodasFormatacoes = new TextoNegrito(
                new TextoItalico(
                        new TextoSublinhado(
                                new TextoSimples(conteudo))));
        System.out.println(textoTodasFormatacoes.formata());
    }
}
