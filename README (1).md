# Sistema de Gerenciamento de Projetos

## Descrição

Sistema desenvolvido em Java utilizando Programação Orientada a Objetos
(POO), arquitetura MVC e persistência em MySQL.

### Principais funcionalidades

-   Cadastro de usuários
-   Gerenciamento de projetos
-   Gerenciamento de equipes
-   Controle de tarefas
-   Autenticação de usuários
-   Geração de relatórios
-   Controle de status das tarefas

## Tecnologias

-   Java
-   MySQL
-   JDBC
-   MVC (Model-View-Controller)
-   Programação Orientada a Objetos

## Pilares de POO Aplicados

### Abstração

Representação das entidades do negócio através das classes: - Usuario -
Gerente - Colaborador - Administrador - Projeto - Equipe - Tarefa

### Encapsulamento

Proteção dos atributos sensíveis utilizando modificadores de acesso
privados e métodos controlados.

### Herança

A classe `Usuario` serve como base para: - Gerente - Colaborador -
Administrador

### Polimorfismo

Implementação do método `gerarRelatorio()` com comportamentos
específicos para cada perfil de usuário.

## Estrutura do Projeto

``` text
src/
├── model/
├── controller/
├── repository/
├── service/
└── Main.java
```

## Arquitetura

### Model

Responsável pelas entidades e regras de negócio.

### Controller

Responsável pelo recebimento das requisições e coordenação das
operações.

### Repository

Responsável pela persistência dos dados no banco MySQL.

### Service

Responsável pelas regras de negócio complementares.

## Banco de Dados

Banco de dados utilizado: MySQL.

Exemplo de conexão:

``` java
jdbc:mysql://localhost:3306/gestao_projetos
```

## Objetivo

Fornecer uma solução para gerenciamento de projetos, equipes e tarefas
utilizando boas práticas de desenvolvimento orientado a objetos.
