package com.example.product.controller;

import com.example.product.entity.Order;
import com.example.product.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;

    }

    @GetMapping("/order")
    public ModelAndView orderHome(Model model) {
        model.addAttribute("order", new Order());
        return new ModelAndView("orderform");
    }

    @PostMapping("/saveOrder")
    public void saveOrder(@ModelAttribute Order order) {
        orderService.saveOrder(order);
    }

    @GetMapping("/deleteOrder")
    public void deleteOrder(@PathVariable("id") int id) {
        orderService.deleteOrder(id);

    }

    @GetMapping("/findOrder/{id}")
    public void findOrder(@PathVariable("id") int id) {
        orderService.findOrder(id);
    }

}
