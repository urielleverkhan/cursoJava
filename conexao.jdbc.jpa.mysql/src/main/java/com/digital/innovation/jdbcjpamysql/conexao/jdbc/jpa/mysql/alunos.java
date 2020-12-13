package com.digital.innovation.jdbcjpamysql.conexao.jdbc.jpa.mysql;

import javax.persistence.*;

@Entity
public class alunos {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;
    @Column
    private int idade;
    @Column
    private String estado;

    public alunos(int id, String nome, int idade, String estado){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.estado = estado;
    }
    public alunos( String nome, int idade, String estado){
        this.nome = nome;
        this.idade = idade;
        this.estado = estado;
    }
    public alunos(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
