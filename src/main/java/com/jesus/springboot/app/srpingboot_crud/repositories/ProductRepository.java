package com.jesus.springboot.app.srpingboot_crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.jesus.springboot.app.srpingboot_crud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
