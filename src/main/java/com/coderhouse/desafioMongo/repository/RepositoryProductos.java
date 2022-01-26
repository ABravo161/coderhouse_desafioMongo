package com.coderhouse.desafioMongo.repository;

import com.coderhouse.desafioMongo.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProductos extends MongoRepository<Producto, String> {

}
