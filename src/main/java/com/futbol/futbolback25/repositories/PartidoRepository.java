package com.futbol.futbolback25.repositories;

import com.futbol.futbolback25.models.PartidoModel;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepository extends MongoRepository<PartidoModel,String> {
    
}
