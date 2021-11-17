package com.futbol.futbolback25.services;

import java.util.List;
import java.util.Optional;

import com.futbol.futbolback25.models.PartidoModel;
import com.futbol.futbolback25.repositories.PartidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidoService {
    

    //Crear la instancia del PartidoRepository
    @Autowired
    PartidoRepository partidoRepository;// contiene los métodos crud


    //Método para guaradar un partido
    public void guardarPartido(PartidoModel partido){
       this.partidoRepository.save(partido);
    }


    //Método para listar los partidos
    public List<PartidoModel> traerPartidos(){
        return this.partidoRepository.findAll();
    }

    public PartidoModel getPartido(String id){
      return  this.partidoRepository.findById(id).orElse(new PartidoModel());
    }

    


}
