//package com.example.demo.controller;
//
//import com.example.demo.entities.Food;
//import com.example.demo.implementService.IFoodService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//import java.util.Optional;
//
//@CrossOrigin
//@RestController
//@RequestMapping("/api")
//public class FoodController {
//
//    @Autowired
//    public IFoodService iFoodService;
//
//    @GetMapping("/home")
//    public String index(){
//        return "demo";
//    }
//
//    @GetMapping("/foods")
//    public List<Food> getAllFoods(){
//        return iFoodService.getAllFoods();
//    }
//
//    @GetMapping("/food/{id}")
//    public Optional<Food> getFood(@PathVariable("id") Long id){
//        return iFoodService.getFoodById(id);
//    }
//
//    @RequestMapping(value = "/add",method = RequestMethod.POST)
//    public Food addFood(@RequestBody Food food){
//        return iFoodService.addFood(food);
//    }
//
//    @PutMapping("/update")
//    public Food updateFood(@RequestParam("id") Long id, @RequestBody Food food){
//        return iFoodService.updateFood(id,food);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public boolean deleteFood(@PathVariable("id") Long id){
//        return iFoodService.deleteFood(id);
//    }
//
//
//    //    @GetMapping("/foods")
////    public List<FoodDto> getAllFoods(){
////        List<Food> foods = foodRepository.findAll();
////        List<FoodDto> foodDto = new ArrayList<FoodDto>();
////        for(Food food :foods){
////            foodDto.add();
////        }
////        return foodDto;
////    }
//}
