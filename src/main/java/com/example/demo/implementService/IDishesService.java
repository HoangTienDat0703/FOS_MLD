package com.example.demo.implementService;

import com.example.demo.entities.Dishes;

import java.util.List;
import java.util.Optional;

public interface IDishesService {
    public Dishes addDishes(Dishes dishes);

    public Dishes updateDishes(Long id,Dishes dishes);

    public boolean deleteDishes(Long id);

    public List<Dishes> getAllDishes();

    public Optional<Dishes> getFoodById(Long id);
}
