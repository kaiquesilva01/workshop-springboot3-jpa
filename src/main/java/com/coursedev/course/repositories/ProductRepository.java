package com.coursedev.course.repositories;

import com.coursedev.course.entities.Category;
import com.coursedev.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {
}
