package com.example.demo.implementService;

import com.example.demo.entities.FOSUser;

import java.util.List;
import java.util.Optional;

public interface IFOSUserService {
    public FOSUser addFOSUser(FOSUser fosUser);

    public FOSUser updateFOSUser(FOSUser fosUser);

    public boolean deleteFOSUser(Long id);

    public List<FOSUser> getAllFOSUser();

    public Optional<FOSUser> getFOSUserById(Long id);
}
