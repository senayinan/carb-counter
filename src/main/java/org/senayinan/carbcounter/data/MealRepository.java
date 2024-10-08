package org.senayinan.carbcounter.data;

import org.senayinan.carbcounter.models.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepository extends CrudRepository<Meal, Integer> {
    Meal findById(int mealId);
}
