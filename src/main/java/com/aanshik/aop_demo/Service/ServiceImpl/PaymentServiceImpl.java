package com.aanshik.aop_demo.Service.ServiceImpl;

import com.aanshik.aop_demo.Service.PaymentService;

public class PaymentServiceImpl implements PaymentService {
    public void makePayment() {
        System.out.println("Amount Debited");




        System.out.println("Amount Credited");
    }
}
