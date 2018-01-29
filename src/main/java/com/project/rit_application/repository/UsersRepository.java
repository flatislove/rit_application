package com.project.rit_application.repository;

import com.project.rit_application.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users,Long>,JpaRepository<Users,Long> {
}
