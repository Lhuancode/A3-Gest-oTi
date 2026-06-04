package br.com.gestaoprojetos.model;
public class Administrador extends Usuario{
 public Administrador(Long id,String nome,String email){super(id,nome,email);}
 @Override public String gerarRelatorio(){return "Relatório Estratégico";}
}