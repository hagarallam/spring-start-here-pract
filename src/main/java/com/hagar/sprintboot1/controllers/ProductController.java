package com.hagar.sprintboot1.controllers;

import com.hagar.sprintboot1.model.Product;
import com.hagar.sprintboot1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {


    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService){
        this.productService=productService;
    }
    @GetMapping("/products")
    public String getAll(Model model){
        model.addAttribute("products",productService.getAll());
        return "products.html";
    }

//    @PostMapping("/products")
//    public String addProduct(@RequestParam(required = false) String name,@RequestParam(required = false) double price ,Model model){
//        Product product = new Product();
//        product.setName(name);
//        product.setPrice(price);
//        productService.addProduct(product);
//        model.addAttribute("products",productService.getAll());
//        return "products.html";
//    }

    @PostMapping("/products")
    public String addProduct(Product product ,Model model){
        productService.addProduct(product);
        model.addAttribute("products",productService.getAll());
        return "products.html";
    }

}
