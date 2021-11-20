package com.fiap.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.fiap.OceanoDto.*;
import com.fiap.model.*;
public interface OceanoRepository extends MongoRepository<OceanoDto, String>{
	
	
	String getIdOceano(String nome);
	OceanoModel getQuimicaOceano(String id);
	
}
