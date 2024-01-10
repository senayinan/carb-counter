package org.senayinan.carbcounter.models;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Entity;

@Entity
public class Meal extends AbstractEntity {

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;
    @Size(max = 500, message = "Description too long!")
    private String description;

    public Meal(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Meal()   {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return name;
    }


}
