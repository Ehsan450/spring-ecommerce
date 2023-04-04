package com.example.product.service;

import com.example.product.entity.Order;
import com.example.product.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository=orderRepository;

    }
    public void deleteOrder(int id){
        orderRepository.deleteById(id);

    }
   public void saveOrder(Order order){
        orderRepository.save(order);

   }
   public void findOrder(int id){
        orderRepository.findById(id);
   }



}
