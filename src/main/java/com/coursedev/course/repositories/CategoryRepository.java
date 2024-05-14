package com.coursedev.course.repositories;

import com.coursedev.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Long> {
}
