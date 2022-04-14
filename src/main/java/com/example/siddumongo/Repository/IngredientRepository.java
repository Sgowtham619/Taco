package com.example.siddumongo.Repository;

import com.example.siddumongo.Model.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredientRepository extends MongoRepository<Ingredient,String> {
}
