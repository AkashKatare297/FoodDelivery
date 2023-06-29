package com.edu.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.main.entity.CustomerAddress;
import com.edu.main.error.GlobalException;

@Service
public interface CustomerAddressService {

	public CustomerAddress saveCustomerAddress(CustomerAddress customeraddress);

	public List<CustomerAddress> getAllCustomerAddress();

	public void deleteCustomerAddressById(Integer addressid) throws GlobalException;

	public CustomerAddress updateCustomerAddressById(Integer addressid, CustomerAddress customeraddress) throws GlobalException;

}
