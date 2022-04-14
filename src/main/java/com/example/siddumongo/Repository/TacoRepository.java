package com.example.siddumongo.Repository;

import com.example.siddumongo.Model.Taco;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TacoRepository extends MongoRepository<Taco,String> {
}
