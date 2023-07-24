package com.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.dao.Customer;
import com.edu.dao.FoodCart;
import com.edu.dao.Item;
import com.edu.error.GlobalException;
import com.edu.service.FoodCartService;
import com.edu.service.FoodCartServiceImpl;

@RestController
@CrossOrigin(origins =  "http://localhost:4200")
public class FoodCartController {
	
	@Autowired
	FoodCartService cartSerice;
	
	@RequestMapping(method = RequestMethod.POST,value = "/savecart")
	public FoodCart saveCart(@RequestBody FoodCart foodCart) {
		return cartSerice.savecart(foodCart); 
		
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/findCartByID/{id}") 
	public FoodCart getCartById(@PathVariable("id") Integer id) {
		return cartSerice.getCartById(id); 
		
	}
	
	@RequestMapping(value = "/getAllCart",method = RequestMethod.GET)
	public List<FoodCart> 	 getCart() {
		return cartSerice.getAllCart();	
	}

	@RequestMapping(value = "/getItemsByCartId/{id}",method = RequestMethod.GET)
	public List<Item> getItemByCartId(@PathVariable("id") Integer id) throws GlobalException {
		return cartSerice.getItemByCartId(id);
		
	}
	
	
	@RequestMapping(value = "/updateCartByItem/{id}",method = RequestMethod.PUT)
	public FoodCart updateCartByItem(@PathVariable("id") Integer id,@RequestBody Item item) throws GlobalException {
		return cartSerice.updateCartByItem(id,item);
	}
	
	@RequestMapping(value = "/updateCartByCustomer/{id}",method = RequestMethod.POST)
	public FoodCart updateCartbyCustomer(@PathVariable("id") Integer id,@RequestBody Customer cust) throws GlobalException {
		return cartSerice.updateCartbyCustomer(id,cust);
	}
	
	@RequestMapping(value = "/getCartByEmail/{email}",method = RequestMethod.GET)
	public FoodCart getCartBYEmail(@PathVariable String email)  throws GlobalException{
		return cartSerice.getCartBYEmail(email);
	}
	
	@RequestMapping(value = "/deleteItemInCartById/{cartId}",method = RequestMethod.DELETE)
	public FoodCart deleteItemInCartByID(@PathVariable("cartId") Integer cartID) throws GlobalException {
		return cartSerice.deleteItemInCartByID(cartID);
	}

}
