package br.com.gestaoprojetos.model;

public class Gerente extends Usuario {

    public Gerente(Long id, String nome) {
        super(id, nome);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório Gerencial");
    }
}