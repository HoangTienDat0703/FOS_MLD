//package com.example.demo.service;
//
//import com.example.demo.entities.User;
//import com.example.demo.implementService.IUserService;
//import com.example.demo.repo.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserService implements IUserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//    @Override
//    public User addUser(User user) {
//        return userRepository.save(user);
//    }
//
//    @Override
//    public User updateUser(User user, Long id) {
//        User user1 = userRepository.getById(id);
//        if(user1 != null){
//            user1.setName(user.getName());
//            user1.setRole(user.getRole());
//            return userRepository.save(user1);
//        }
//        return null;
//    }
//
//    @Override
//    public boolean deleteUser(Long id) {
//        User user = userRepository.getById(id);
//        if(user != null){
//            userRepository.delete(user);
//            return true;
//        }
//        return false;
//    }
//}
