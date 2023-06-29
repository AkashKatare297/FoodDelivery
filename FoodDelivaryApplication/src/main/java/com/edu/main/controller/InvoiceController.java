package com.edu.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.edu.main.service.InvoiceService;


@RestController
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;
}
