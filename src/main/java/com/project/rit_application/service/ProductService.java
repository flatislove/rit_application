package com.project.rit_application.service;

import com.project.rit_application.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductByIndex(long index);

}
