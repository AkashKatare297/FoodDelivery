package com.edu.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.main.entity.Orders;
import com.edu.main.service.OrdersService;


@RestController
public class OrdersController {

	@Autowired
	private OrdersService ordersService; 
	
	@PostMapping("/enterOrder")
	public Orders enterOrder(@RequestBody Orders orders) {
		return ordersService.enterOrder(orders);
	}
}
