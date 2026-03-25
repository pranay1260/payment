package com.jsw.project_java.payment;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy  // object will be created only when needed
public class CardPayment implements Payment {

    public CardPayment() {
        System.out.println("CardPayment Constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("CardPayment Initialized");
    }

    @Override
    public String pay() {
        return "Paid using Card";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("CardPayment Destroyed");
    }
}