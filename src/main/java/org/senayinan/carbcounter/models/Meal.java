package org.senayinan.carbcounter.models;


import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Meal extends AbstractEntity {
    @Enumerated(EnumType.STRING)
    @NotBlank(message = "Name is required")
    //@Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private MealName mealName;
    private List<Food>foodList;
    private List<FoodItem> foodItemList;
    @Size(max = 500, message = "Description too long!")
    private String description;

    public Meal(MealName mealName, String description,List<Food>foodList, List<FoodItem>foodItemList) {
        this.mealName = mealName;
        this.description = description;
        this.foodItemList = foodItemList;
        this.foodList = foodList;
    }

    public Meal()   {}

    public MealName getMealName() {
        return mealName;
    }

    public void setMealName(MealName mealName) {
        this.mealName = mealName;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public List<FoodItem> getMealItem() {
        return foodItemList;
    }

    public void setMealItem(List<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Meal: " + mealName;
    }
}
