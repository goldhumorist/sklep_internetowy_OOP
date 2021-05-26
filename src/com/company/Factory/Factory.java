package com.company.Factory;

import com.company.Product.Product;
import com.company.Product.TypeOfProduct;

public class Factory {
        public static Product createProduct (TypeOfProduct typeOfProduct, String productName, double price, boolean isAvailability){
                    Product product = new Product(typeOfProduct, productName, price, isAvailability);
                    return product;
        }
}

