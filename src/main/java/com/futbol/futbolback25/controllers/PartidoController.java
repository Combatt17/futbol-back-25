package com.futbol.futbolback25.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.futbol.futbolback25.models.PartidoModel;
import com.futbol.futbolback25.services.PartidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

//Definimos el tipo de controlador 
@RestController
@RequestMapping("/api") //definimos la ruta
public class PartidoController {
    
    //Instanciar el servicio de los partidos
    @Autowired
    PartidoService partidoService;

    //Método para guardar un partido
    @PostMapping("/partidos")
    public ResponseEntity<Map<String, String>> guardar(@RequestBody PartidoModel partido){
        this.partidoService.guardarPartido(partido);

        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje","Se agregó correctamente");

        return ResponseEntity.ok(respuesta);

    }

    //Método para obtener los datos de los partidos
    @GetMapping("/partidos")
    public List<PartidoModel> mostrar(){
        return this.partidoService.traerPartidos();
    }

    //Método para actualizar un partido
    @PutMapping("/partidos")
    public ResponseEntity<Map<String, String>> actualizar(@RequestBody PartidoModel partido){
        this.partidoService.guardarPartido(partido);

        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje","Se actualizó correctamente");

        return ResponseEntity.ok(respuesta);

    }



    
}
