package com.company.Delivery;


public class Shipment implements  OrderState {
    Order order;

    @Override
    public void proceed(Order order) {
        System.out.println("Order proceed");
       order.show();
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order proceed");
        order.show();

    }

    @Override
    public void expelled(Order order) {
        System.out.println("Order proceed");
        order.show();
    }
}
