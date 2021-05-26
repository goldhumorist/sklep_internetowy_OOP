package com.company.Product;

public class Product {
    private TypeOfProduct typeOfProduct;
    private String productName;
    private double price;
    private boolean isAvailability;


    public Product(TypeOfProduct typeOfProduct, String productName, double price, boolean isAvailability) {
        this.typeOfProduct = typeOfProduct;
        this.productName = productName;
        this.price = price;
        this.isAvailability = isAvailability;

    }

    public TypeOfProduct getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(TypeOfProduct typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return isAvailability;
    }

    public void setAvailability(boolean availability) {
        isAvailability = availability;
    }

}
