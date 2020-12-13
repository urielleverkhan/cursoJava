package com.estudo.javaspringrestfull.javaspringrestfull.service;

import com.estudo.javaspringrestfull.javaspringrestfull.controller.request.SoldadoEditRequest;
import com.estudo.javaspringrestfull.javaspringrestfull.dto.Soldado;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SoldadoService {
    public Soldado buscarSoldado(String id){
        Soldado soldado =  new Soldado();
        soldado.setId(id);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e Flecha");
        return soldado;
    }

    public void criarSoldado(Soldado soldado){

    }

    public void alterarSoldado(String id, SoldadoEditRequest soldadoEditRequest) {

    }

    public void deletSoldado(String id) {
    }

    public List<Soldado> buscarTodosSoldados(){
        Soldado soldado1 =  new Soldado();
        soldado1.setId("1");
        soldado1.setNome("Legolas");
        soldado1.setRaca("Elfo");
        soldado1.setArma("Arco e Flecha");
        Soldado soldado2 =  new Soldado();
        soldado2.setId("2");
        soldado2.setNome("Aragon");
        soldado2.setRaca("Humano");
        soldado2.setArma("Espada");


        return Arrays.asList(soldado1, soldado2);

    }
}


