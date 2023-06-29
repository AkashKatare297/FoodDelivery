package com.edu.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.main.repo.InvoiceRepository;

@Service
public class InvoiceSerivceImpl implements InvoiceService {
	
	@Autowired
	private InvoiceRepository invoiceRepository;
}
