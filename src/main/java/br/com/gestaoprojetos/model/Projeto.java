package br.com.gestaoprojetos.model;
import java.util.*;
public class Projeto{
 private String nome; private List<Tarefa> tarefas=new ArrayList<>();
 public Projeto(String nome){this.nome=nome;}
 public void adicionarTarefa(Tarefa t){tarefas.add(t);}
}