package com.jsw.project_java.manager;

import com.jsw.project_java.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentManager {

    @Autowired
    private PaymentService paymentService;

    public String process() {
        return paymentService.makePayment();
    }
}