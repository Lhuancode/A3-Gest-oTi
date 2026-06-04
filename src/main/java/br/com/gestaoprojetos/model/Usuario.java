package br.com.gestaoprojetos.model;
public abstract class Usuario {
 private Long id; private String nome; private String email;
 public Usuario(Long id,String nome,String email){this.id=id;this.nome=nome;this.email=email;}
 public String getNome(){return nome;}
 public abstract String gerarRelatorio();
}