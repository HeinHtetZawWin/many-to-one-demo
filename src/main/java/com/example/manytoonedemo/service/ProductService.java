package com.example.manytoonedemo.service;

import com.example.manytoonedemo.dao.CategoryDao;
import com.example.manytoonedemo.dao.ProductDao;
import com.example.manytoonedemo.ds.Category;
import com.example.manytoonedemo.ds.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private CategoryDao categoryDao;

    public void createDb() {
        Category category1 = new Category();
        category1.setName("Fruit");

        Category category2 = new Category();
        category2.setName("Meat");

        Product product1 = new Product("Apple", 2, 1000);
        Product product2 = new Product("Orange", 2, 2000);

        Product product3 = new Product("Fish", 3, 10000);
        Product product4 = new Product("Chicken", 4, 15000);

//        category1.getProducts().add(product1);
        /*category1.addProduct(product1);
        category1.addProduct(product2);
        category2.addProduct(product3);
        category2.addProduct(product4);*/

       /* product1.setCategory(category1);
        product2.setCategory(category1);
        product3.setCategory(category2);
        product4.setCategory(category2);
*/
       /* product1.setCategory(category1);
        category1.getProducts().add(product1);*/

        category1.addProduct(product1);
        category1.addProduct(product2);
        category1.addProduct(product3);
        category1.addProduct(product4);

        categoryDao.save(category1);
        categoryDao.save(category2);

       /* productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);*/





    }
}
