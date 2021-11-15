package com.futbol.futbolback25.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.futbol.futbolback25.models.EquipoModel;
import com.futbol.futbolback25.services.EquipoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EquipoController {
    
    @Autowired //Instancia del servicio 
    EquipoService equipoService;


    /*
    Definimos el método HTTP (POST) por el que se va a ejecutar el metodo
    dentro del controller
    */
    //        http://localhost:8080/api/equipos   GET,POST,PUT,DELETE

    //---------------------------------------------------------------------
    @PostMapping("/equipos") 
    public ResponseEntity<Map<String, String>> guardarEquipo(@Valid @RequestBody EquipoModel equipo){
      this.equipoService.guardarEquipos(equipo);
      //Mostrar un mensaje personalizado al cliente
      Map<String, String> respuesta = new HashMap<>();
      respuesta.put("mensaje","Se añadió correctamente");
      respuesta.put("estado","true");
      /*
      {
          "mensaje":"Se añadió correctamente",
          "estado":"true"
      }
      */
      return ResponseEntity.ok(respuesta);

    }
    //-------------------------------------------------------------------------





    @GetMapping("/equipos") //GET
    public List<EquipoModel> traerEquipos(){
        return this.equipoService.traerEquipos();
    }


    @GetMapping("/equipos/{id}") //GET
    public EquipoModel traerEquipoPorId(@PathVariable String id){
        return this.equipoService.buscarPorId(id).get();
    }
    

}
