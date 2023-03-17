package com.aanshik.aop_demo.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(* com.aanshik.aop_demo.Service.ServiceImpl.PaymentServiceImpl.makePayment())")
    public void auth(){
        System.out.println("Payment Started");
    }


    //wehn makePayment has arguments then put .makePayment(..) instead of makePayment()

    @After("execution(* com.aanshik.aop_demo.Service.ServiceImpl.PaymentServiceImpl.makePayment())")
    public void succ(){
        System.out.println("Payment Successful");
    }
}
