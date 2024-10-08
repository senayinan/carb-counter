package org.senayinan.carbcounter.data;

import org.senayinan.carbcounter.models.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food, Integer> {
}
