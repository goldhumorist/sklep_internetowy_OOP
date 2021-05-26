package com.company.Delivery;

import com.company.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Product> order = new ArrayList<>();
    Product product;

    void add(){
        order.add(product);
    }
    void show(){
        for (Product product: order) {
            System.out.println(product);
        }
    }
}
