package org.senayinan.carbcounter.controllers;

import jakarta.validation.Valid;
import org.senayinan.carbcounter.data.MealRepository;
import org.senayinan.carbcounter.models.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("meals")
public class MealController {
    @Autowired
    private MealRepository mealRepository;
    @GetMapping
    public String displayAllMeals(Model model)  {
        model.addAttribute("title","AllMeals");
        model.addAttribute("meals", mealRepository.findAll());
        return "meals/index";
    }
    @GetMapping("create")
    public String displayCreateMealForm(Model model)  {
        model.addAttribute("title","Create Meal");
        model.addAttribute(new Meal());
        return "meals/create";

    }
    @PostMapping("create")
    public String processCreateMealForm(@ModelAttribute @Valid Meal newMeal,
                                        Errors errors, Model model)  {
        if(errors.hasErrors())  {
            model.addAttribute("title", "Create Meal");
            return "meals/create";
        }
        mealRepository.save(newMeal);
        return "redirect:";

    }
    @GetMapping("delete")
    public  String displayDeleteMealForm(Model model)   {
        model.addAttribute("title", "Delete Meals");
        model.addAttribute("meals", mealRepository.findAll());
        return "meals/delete";
    }
    @PostMapping("delete")
    public String processDeleteMealsForm(@RequestParam(required = false) int[] mealIds) {
        if (mealIds != null) {
            for (int id : mealIds) {
                mealRepository.deleteById(id);
            }
        }
        return "redirect:";
    }
}
