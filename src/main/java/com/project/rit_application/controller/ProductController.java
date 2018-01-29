package com.project.rit_application.controller;

import com.project.rit_application.model.Product;
import com.project.rit_application.repository.ProductRepository;
import com.project.rit_application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final
    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/hello")
    List<Product> readBookmark() {
        return productService.getAllProduct();
    }



}
