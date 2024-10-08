package org.senayinan.carbcounter.controllers;

import jakarta.validation.Valid;
import org.senayinan.carbcounter.data.FoodRepository;
import org.senayinan.carbcounter.models.Food;
import org.senayinan.carbcounter.models.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("foods")
public class FoodController {
    @Autowired
    private FoodRepository foodRepository;
    @GetMapping
    public String displayAllCategories(Model model) {
        model.addAttribute("title", "All Foods");
        model.addAttribute("foods", foodRepository.findAll());
        return "foods/index";
    }
    @GetMapping("create")
    public String renderCreateFoodForm(Model model)  {
        model.addAttribute("title","Create Food");
        model.addAttribute(new Food());
        return "foods/create";
    }
    public String processCreateFoodForm(@Valid @ModelAttribute Food newFood,

                                        Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Food");
            model.addAttribute(new Food());
            return "foods/create";
        }

        foodRepository.save(newFood);
        return "redirect:";
    }

    }



