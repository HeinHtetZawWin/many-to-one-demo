package com.example.manytoonedemo.dao;

import com.example.manytoonedemo.ds.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDao extends CrudRepository<Category, Integer> {
}
