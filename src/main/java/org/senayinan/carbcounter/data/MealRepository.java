package org.senayinan.carbcounter.data;

import org.senayinan.carbcounter.models.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends CrudRepository<Meal, Integer> {
}
