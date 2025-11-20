package org.example.composite;

import org.example.composite.ComponenteSistemaArquivo;

public class Arquivo implements ComponenteSistemaArquivo {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void listar() {
        System.out.println("Abrindo arquivo: " + nome);
    }
}