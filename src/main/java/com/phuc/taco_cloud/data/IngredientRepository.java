package com.phuc.taco_cloud.data;

import com.phuc.taco_cloud.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
