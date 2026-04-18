package com.jesus.springboot.app.srpingboot_crud.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.jesus.springboot.app.srpingboot_crud.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String name);

}
