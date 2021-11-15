package com.futbol.futbolback25.services;

import java.util.List;
import java.util.Optional;

import com.futbol.futbolback25.models.EquipoModel;
import com.futbol.futbolback25.repositories.EquipoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Definimos la clase como un servicio
public class EquipoService {

    @Autowired //Creamos la instancia del repository
    EquipoRepository equipoRepository; 

    //Método para guardar equipos
    public void guardarEquipos(EquipoModel equipo) {
        this.equipoRepository.save(equipo);
    }

    //Método para traer los Equipos
    public List<EquipoModel> traerEquipos() {
        return this.equipoRepository.findAll();
    }

    //Método para buscar equipo por ID
    public Optional<EquipoModel> buscarPorId(String id) {
         return this.equipoRepository.findById(id);
    }

    //Método para verificar si ya existe el equipo
    public Boolean verificar(String id) {
        return this.equipoRepository.existsById(id);
    }

    //Método para eliminar un equipo
    public void eliminar(String id) {
        this.equipoRepository.deleteById(id);
    }

    
}
