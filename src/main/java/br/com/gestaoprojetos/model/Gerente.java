package br.com.gestaoprojetos.model;
public class Gerente extends Usuario{
 public Gerente(Long id,String nome,String email){super(id,nome,email);}
 @Override public String gerarRelatorio(){return "Relatório Gerencial";}
}