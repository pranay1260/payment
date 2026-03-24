package com.jsw.project_java.controller;

import com.jsw.project_java.manager.PaymentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentManager manager;

    @GetMapping("/pay")
    public String pay() {
        return manager.process();
    }
}