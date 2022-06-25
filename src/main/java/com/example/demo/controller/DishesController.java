package com.example.demo.controller;

import com.example.demo.entities.Dishes;
import com.example.demo.implementService.IDishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class DishesController {
    @Autowired
    public IDishesService iDishesService;

    @GetMapping("/dishes")
    private List<Dishes> getAllDishes(){
        return iDishesService.getAllDishes();
    }


    @PostMapping("/dishes/add")
    private Dishes saveDishes(@RequestBody Dishes dishes){
        return iDishesService.addDishes(dishes);
    }

    @PutMapping("/dishes/update")
    private Dishes updateDishes(@RequestBody Dishes dishes){
        return iDishesService.updateDishes(dishes);
    }

    @DeleteMapping("/dishes/delete/{id}")
    public boolean deleteDishes(@PathVariable("id") Long id){
        return iDishesService.deleteDishes(id);
    }

}
