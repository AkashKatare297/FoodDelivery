package com.edu.main.service;

import java.util.List;

import com.edu.main.entity.RestaurantAddress;
import com.edu.main.error.GlobalException;

public interface RestaurantAddressService{

	public RestaurantAddress saveRestaurantAddress(RestaurantAddress restaurantaddress);

	public List<RestaurantAddress> getAllRestaurantAddress();

	public void deleteRestaurantAddressById(Integer addressid) throws GlobalException;

	public RestaurantAddress updateRestaurantAddressById(Integer addressid, RestaurantAddress restaurantaddress) throws GlobalException;

}
