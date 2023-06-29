package com.edu.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.main.entity.Invoice;


@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer>{

}
