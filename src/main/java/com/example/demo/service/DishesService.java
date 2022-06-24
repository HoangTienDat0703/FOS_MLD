package com.example.demo.service;

import com.example.demo.entities.Category;
import com.example.demo.entities.Dishes;
import com.example.demo.implementService.IDishesService;
import com.example.demo.repo.CategoryRepository;
import com.example.demo.repo.DishesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DishesService implements IDishesService {

    @Autowired
    private DishesRepository dishesRepository;

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Dishes addDishes(Dishes dishes) {
        return dishesRepository.save(dishes);
    }

    @Override
    public Dishes updateDishes(Long id, Dishes dishes) {
        Category category = categoryRepository.findByCategoryId(dishes.getCategory().getCategoryId());
        if(dishes!=null){
            Dishes dishes1 = dishesRepository.getById(id);
            if(dishes1!=null){
                dishes1.setDishesName(dishes.getDishesName());
                dishes1.setDescription(dishes.getDescription());
                dishes1.setDishImage(dishes.getDishImage());
                dishes1.setDiscount(dishes.getDiscount());
                dishes1.setCategory(category);
                dishes1.setCostPrice(dishes.getCostPrice());
                dishes1.setSalePrice(dishes.getSalePrice());

                return dishesRepository.save(dishes1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteDishes(Long id) {
        Dishes dishes = dishesRepository.getById(id);
        if(dishes != null){
            dishesRepository.delete(dishes);
            return true;
        }
        return false;
    }

    @Override
    public List<Dishes> getAllDishes() {
        return dishesRepository.findAll();
    }

    @Override
    public Optional<Dishes> getFoodById(Long id) {
        return Optional.empty();
    }
}
