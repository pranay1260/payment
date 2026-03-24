package com.jsw.project_java.service;

import com.jsw.project_java.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    @Qualifier("upiPayment") 
    private Payment payment;

    public String makePayment() {
        return payment.pay();
    }
}