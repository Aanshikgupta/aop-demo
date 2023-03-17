package com.aanshik.aop_demo;

import com.aanshik.aop_demo.Service.PaymentService;
import com.aanshik.aop_demo.Service.ServiceImpl.PaymentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        PaymentService paymentObject=context.getBean("payment",PaymentServiceImpl.class);
        //auth: Payment Started but don't change existing code
        paymentObject.makePayment();
    }
}
