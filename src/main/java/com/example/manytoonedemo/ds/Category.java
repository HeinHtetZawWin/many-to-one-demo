package com.example.manytoonedemo.ds;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

//    @JoinTable(
//            name = "my_category_my_product",
//            joinColumns =
//                    @JoinColumn(name = "cat_id", referencedColumnName = "id"),
//            inverseJoinColumns =
//                    @JoinColumn(name = "product_id", referencedColumnName = "id")
//    )

    @OneToMany(mappedBy = "category",cascade = CascadeType.PERSIST)
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        product.setCategory(this);
        products.add(product);
    }

}
