package com.jsw.project_java.payment;

import org.springframework.stereotype.Component;

@Component
public class NetBankingPayment implements Payment {

    @Override
    public String pay() {
        return "Paid using NetBanking";
    }
}