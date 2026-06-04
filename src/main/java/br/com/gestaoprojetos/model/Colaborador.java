package br.com.gestaoprojetos.model;
public class Colaborador extends Usuario{
 public Colaborador(Long id,String nome,String email){super(id,nome,email);}
 @Override public String gerarRelatorio(){return "Relatório Individual";}
}