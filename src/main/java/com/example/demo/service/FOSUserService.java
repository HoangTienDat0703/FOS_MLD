package com.example.demo.service;

import com.example.demo.entities.FOSUser;
import com.example.demo.entities.Role;
import com.example.demo.implementService.IFOSUserService;
import com.example.demo.repo.FOSUserRepository;
import com.example.demo.repo.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FOSUserService implements IFOSUserService {

    @Autowired
    public FOSUserRepository fosUserRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Override
    public FOSUser addFOSUser(FOSUser fosUser) {
        return fosUserRepository.save(fosUser);
    }

    @Override
    public FOSUser updateFOSUser(FOSUser fosUser) {
        Role role = roleRepository.findByRoleId(fosUser.getRole().getRoleId());
        if(fosUser != null){
            FOSUser fosUser1 = fosUserRepository.getById(fosUser.getUserId());
            if(fosUser1 != null){
                fosUser1.setFullName(fosUser.getFullName());
                fosUser1.setUserName(fosUser.getUserName());
                fosUser1.setPassword(fosUser.getPassword());
                fosUser1.setRole(role);
                fosUser1.setContact(fosUser.getContact());
                fosUser1.setEmail(fosUser.getEmail());
                fosUser1.setGender(fosUser.getGender());
                fosUser1.setStatus(fosUser.getStatus());
                fosUser1.setProfileImage(fosUser.getProfileImage());

                return  fosUserRepository.save(fosUser1);
            }
        }

        return null;
    }

    @Override
    public boolean deleteFOSUser(Long id) {
        FOSUser fosUser = fosUserRepository.getById(id);
        if(fosUser != null){
            fosUserRepository.delete(fosUser);
            return true;
        }
        return false;
    }

    @Override
    public List<FOSUser> getAllFOSUser() {
        return fosUserRepository.findAll();
    }

    @Override
    public Optional<FOSUser> getFOSUserById(Long id) {
        return Optional.empty();
    }
}
