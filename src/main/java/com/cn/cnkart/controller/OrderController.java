package com.cn.cnkart.controller;

import com.cn.cnkart.entity.Order;
import com.cn.cnkart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/id/{id}")
    public Order getById(@PathVariable int id){
        return orderService.getById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Order order){
        orderService.save(order);
    }

    @DeleteMapping("/delete/id/{id}")
    public String delete(@PathVariable int id){
        orderService.delete(id);
        return "Order has been deleted.";
    }
}
