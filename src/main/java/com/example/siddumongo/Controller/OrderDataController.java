package com.example.siddumongo.Controller;

import com.example.siddumongo.Model.Order;
import com.example.siddumongo.Repository.OrderRepository;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrderDataController {

    private final OrderRepository orderRepo;

    public OrderDataController(OrderRepository orderRepo) {
        this.orderRepo = orderRepo;
    }


    @GetMapping
    public List<Order> getOrders(@RequestParam @Nullable String id) {
        if(id == null || id.isBlank())
            return orderRepo.findAll();
        else
            return orderRepo.findById(id).stream().collect(Collectors.toList());
    }

    @PostMapping("/update_city")
    public Order updateOrder(@RequestParam String id, @RequestBody Order order) throws Exception {

        Optional<Order> actualOrder = orderRepo.findById(id);

        if(actualOrder.isEmpty()) {
            throw new Exception("Order id not found");
        }

        Order updatedOrder = actualOrder.get();

        updatedOrder.setCity(order.getCity() == null ? updatedOrder.getCity() : order.getCity());


        return orderRepo.save(updatedOrder);
    }


}