package com.jesus.springboot.app.srpingboot_crud.services;

import java.util.List;
import java.util.Optional;

import com.jesus.springboot.app.srpingboot_crud.entities.User;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void deleteById(Long id);
}
