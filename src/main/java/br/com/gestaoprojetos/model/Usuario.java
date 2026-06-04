package br.com.gestaoprojetos.model;

public abstract class Usuario {
    private Long id;
    private String nome;

    public Usuario(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void gerarRelatorio();
}