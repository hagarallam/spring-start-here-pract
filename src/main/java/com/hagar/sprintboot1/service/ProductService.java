package com.hagar.sprintboot1.service;

import com.hagar.sprintboot1.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> productList = new ArrayList<>();

    public List<Product> getAll(){
        return productList;
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }
}
