//package com.example.demo.service;
//
//import com.example.demo.entities.Food;
//import com.example.demo.implementService.IFoodService;
//import com.example.demo.repo.FoodRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class FoodService implements IFoodService {
//    @Autowired
//    private FoodRepository foodRepository;
//
//    @Override
//    public Food addFood(Food food) {
//        if(food!=null){
//            return foodRepository.save(food);
//        }
//        return null;
//    }
//
//    @Override
//    public Food updateFood(Long id, Food food) {
//        if(food!=null){
//            Food food1 = foodRepository.getById(id);
//            if(food1!=null){
//                food1.setName(food.getName());
//                food1.setCostPrice(food.getCostPrice());
//                food1.setSalePrice(food.getSalePrice());
//
//                return foodRepository.save(food1);
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public boolean deleteFood(Long id) {
//        Food food = foodRepository.getById(id);
//        if(food != null){
//            foodRepository.delete(food);
//            return true;
//        }
//        return  false;
//    }
//
//    @Override
//    public List<Food> getAllFoods() {
//        return foodRepository.findAll();
//    }
//
//    @Override
//    public Optional<Food> getFoodById(Long id) {
//        return foodRepository.findById(id);
//    }
//}
