package com.futbol.futbolback25.controllers;

import java.util.HashMap;
import java.util.Map;

import com.futbol.futbolback25.models.UsuarioModel;
import com.futbol.futbolback25.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    //Método para registrar a un usuario
    //Definimos el método de la petición HTTP Post

    @PostMapping("/usuarios") //POST 
    public ResponseEntity<Map<String, String>> guardarUsuarios(@RequestBody UsuarioModel usuario){
        
        //Map tener una clave valor {"mensaje": "Se agregó correctamente"}
        Map<String, String> respuesta= new HashMap<>();

        UsuarioModel u=this.usuarioService.buscarPorusername(usuario.getUsername());
        if(u.getId()==null){
            this.usuarioService.guardar(usuario);
            respuesta.put("mensaje","Se agregó correctamente");
        }else{
            respuesta.put("mensaje","Usuario ya existe");
        }

        return ResponseEntity.ok(respuesta);
    }
}
