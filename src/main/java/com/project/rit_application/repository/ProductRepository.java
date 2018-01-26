package com.project.rit_application.repository;

import com.project.rit_application.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
}
