package com.estudo.javaspringrestfull.javaspringrestfull.entity;


@Enti

@Entity
public class SoldadoEntity {
    @id
    @GenerateValue(Strategy = GenerationTye.AUTO)

    private Long idd;
    private String id;
    private String nome;
    private String raca;
    private String arma;
    private String status;

    public Long getIdd() {
        return idd;
    }

    public void setIdd(Long idd) {
        this.idd = idd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
