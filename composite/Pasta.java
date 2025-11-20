package org.example.composite;

import org.example.composite.ComponenteSistemaArquivo;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ComponenteSistemaArquivo {
    private String nome;
    private List<ComponenteSistemaArquivo> itens = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionaItem(ComponenteSistemaArquivo item) {
        itens.add(item);
    }

    @Override
    public void listar() {
        System.out.println("Pasta: " + nome);
        for (ComponenteSistemaArquivo item : itens) {
            item.listar();
        }
    }
}
