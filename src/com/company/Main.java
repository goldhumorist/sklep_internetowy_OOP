package com.company;

import com.company.Product.Product;
import com.company.Product.TypeOfProduct;
import com.company.Storage.StorehouseProxy;
import com.company.UserInterface.ConsoleTextLazyInitializedSingleton;
import com.company.UserInterface.Loger;

public class Main {
    public static void main(String[] args) {
        Loger concreteLoger = ConsoleTextLazyInitializedSingleton.getInstance();
        ElectronicsShop shop = new ElectronicsShop(new StorehouseProxy(concreteLoger));

        shop.createCorporateClient();
        shop.createDefaultClient();

        shop.addNewProduct(new Product(TypeOfProduct.SmartPhone, "Iphone X", 1000, true));
        shop.addNewProduct(new Product(TypeOfProduct.Computer, "ASUS", 3000, true));

        shop.showAllProduct();
       // shop.removeAllProductsFromStore();

   }
}



