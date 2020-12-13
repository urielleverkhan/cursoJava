package com.estudo.javaspringrestfull.javaspringrestfull.controller;

import com.estudo.javaspringrestfull.javaspringrestfull.controller.request.SoldadoEditRequest;
import com.estudo.javaspringrestfull.javaspringrestfull.dto.Soldado;
import com.estudo.javaspringrestfull.javaspringrestfull.service.SoldadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    private SoldadoService soldadoService;

    public SoldadoController(SoldadoService soldadoService) {
        this.soldadoService = soldadoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Soldado> buscarSoldado(@PathVariable String id) {
        Soldado soldado = soldadoService.buscarSoldado(id);
        return ResponseEntity.status(HttpStatus.OK).body(soldado);
    }

    @GetMapping()
    public ResponseEntity<List<Soldado>> buscarTodosSoldado() {
        List<Soldado> soldado = soldadoService.buscarTodosSoldados();
        return ResponseEntity.status(HttpStatus.OK).body(soldado);
    }

    @PostMapping
    public ResponseEntity criarSoldado(@RequestBody Soldado soldado) {
        soldadoService.criarSoldado(soldado);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity editarSoldado (@PathVariable() String id,
                                         @RequestBody SoldadoEditRequest soldadoEditRequest){
        soldadoService.alterarSoldado(id, soldadoEditRequest);

        return ResponseEntity.ok().build();

    }
    @DeleteMapping("/{id}")
    public ResponseEntity deletSoldado (@PathVariable() String id)
                                         {
        soldadoService.deletSoldado(id);

        return ResponseEntity.ok().build();

    }




}
