package com.project.rit_application.service.implementation;

import com.project.rit_application.model.Product;
import com.project.rit_application.repository.ProductRepository;
import com.project.rit_application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductByIndex(long index) {
        return productRepository.findOne(index);
    }
}
