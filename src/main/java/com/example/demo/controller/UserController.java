//package com.example.demo.controller;
//
//import com.example.demo.entities.User;
//import com.example.demo.implementService.IUserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@CrossOrigin
//@RestController
//@RequestMapping("/api/user")
//public class UserController {
//    @Autowired
//    private IUserService iUserService;
//
//    @GetMapping()
//    public List<User> getAllUser(){
//        return iUserService.getAllUsers();
//    }
//
//    @PostMapping("/add")
//    public User addUser(@RequestBody User user){
//        return iUserService.addUser(user);
//    }
//
//    @PutMapping("/update/")
//    public User updateUser(@RequestParam("id") Long id,@RequestBody User user){
//        return iUserService.updateUser(user,id);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public boolean deleteUser(@PathVariable Long id){
//        return iUserService.deleteUser(id);
//    }
//}
