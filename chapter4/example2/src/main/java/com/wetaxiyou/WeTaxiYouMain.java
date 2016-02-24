package com.wetaxiyou;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WeTaxiYouMain {

    public static void main(String[] args) throws Exception {
        System.out.println("Ready to receive reservations!");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                ReservationConfig.class);

        ReservationHandler handler = context.getBean(ReservationHandler.class);
        System.out.println(handler.run());

        context.close();
    }
}