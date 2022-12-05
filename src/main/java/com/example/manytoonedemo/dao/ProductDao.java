package com.example.manytoonedemo.dao;

import com.example.manytoonedemo.ds.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer> {
}
