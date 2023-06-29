package com.edu.main.service;

import java.util.List;

import javax.validation.Valid;

import com.edu.main.entity.Restaurant;
import com.edu.main.error.GlobalException;

public interface RestaurantService {

	public Restaurant addRestaurant(@Valid Restaurant restaurant);

	public List<Restaurant> getAllRestaurant();

	public Restaurant findRestaurantByName(String restaurantName);

	public Restaurant findRestaurantById(@Valid Integer restaurantId);

	public String deleteRestaurantById(Integer restaurantId) throws GlobalException;

	public Restaurant updateRestaurantManagerName(@Valid Integer id,@Valid String managerName) throws GlobalException;

}
