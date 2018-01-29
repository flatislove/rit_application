package com.project.rit_application.repository;

import com.project.rit_application.model.Selling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SellingRepository extends CrudRepository<Selling,Long>,JpaRepository<Selling,Long> {
}
