package com.example.demo.controller;

import com.example.demo.dto.InvoiceResponseDto;
import com.example.demo.model.Invoice;
import com.example.demo.service.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class InvoiceController {
    private final InvoiceService invoiceService;

    @PostMapping("/invoices/{prescriptionId}")
    public InvoiceResponseDto createInvoice(@PathVariable Integer prescriptionId){
        return invoiceService.createInvoice(prescriptionId);
    }

    @GetMapping("/invoices/{id}")
    public  Optional<Invoice> getInvoiceById(@PathVariable Integer id) {
        return invoiceService.getInvoiceById(id);
    }

    @DeleteMapping("/invoices/{id}")
    public void deleteInvoiceById(@PathVariable Integer id) {
        invoiceService.deleteInvoiceById(id);
    }




}
