package com.coursedev.course.services;

import  com.coursedev.course.entities.Order;
import com.coursedev.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long Id) {
        Optional<Order> obj = repository.findById(Id);
        return obj.get();
    }
}
