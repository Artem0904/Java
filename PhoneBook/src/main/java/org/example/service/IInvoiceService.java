package org.example.service;

import org.example.model.Invoice;

import java.util.List;

public interface IInvoiceService {
    public Invoice saveInvoice(Invoice invoice);
    public List<Invoice> getAllInvoices();
    public Invoice getInvoiceById(Long id);
    public void deleteInvoiceById(Long id);
    public void updateInvoice(Invoice invoice);
}