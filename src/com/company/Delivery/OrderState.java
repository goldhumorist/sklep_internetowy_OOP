package com.company.Delivery;

public interface OrderState {
    public void proceed (Order order);
    public void cancel(Order order);
    public void expelled(Order order);


}
