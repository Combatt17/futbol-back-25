package com.futbol.futbolback25.repositories;

import com.futbol.futbolback25.models.EquipoModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EquipoRepository extends MongoRepository<EquipoModel,String> {
    
}
