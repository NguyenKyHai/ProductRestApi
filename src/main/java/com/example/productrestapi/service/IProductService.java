package com.example.productrestapi.service;

import com.example.productrestapi.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService  {
    List<Product> findAll();
    Optional<Product> findById(Integer id);
    Product save(Product product);
    void delete(Product product);
}
