package com.coursedev.course.repositories;

import com.coursedev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
