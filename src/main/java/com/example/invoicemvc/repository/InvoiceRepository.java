package com.example.invoicemvc.repository;

import com.example.invoicemvc.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository  extends JpaRepository<Invoice, Long> {
}
