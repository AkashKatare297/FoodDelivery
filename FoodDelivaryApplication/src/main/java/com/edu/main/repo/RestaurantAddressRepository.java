package com.edu.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.main.entity.RestaurantAddress;

@Repository
public interface RestaurantAddressRepository extends JpaRepository<RestaurantAddress, Integer>{

}
