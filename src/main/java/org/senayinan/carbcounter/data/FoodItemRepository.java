package org.senayinan.carbcounter.data;

import org.senayinan.carbcounter.models.Meal;
import org.springframework.data.repository.CrudRepository;

public interface FoodItemRepository extends CrudRepository<Meal, Integer> {
}
