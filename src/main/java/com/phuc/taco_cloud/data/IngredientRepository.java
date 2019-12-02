package com.phuc.taco_cloud.data;

import com.phuc.taco_cloud.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
