package org.senayinan.carbcounter.models;

public enum MealName {
    BREAKFAST("Breakfast"),
    LUNCH("Lunch"),
    DINNER("Dinner"),
    SNACK("Snack");
    private final String displayMealName;

    MealName(String displayMealName) {
        this.displayMealName = displayMealName;
    }

    public String getDisplayMealName() {
        return displayMealName;

    }
}
