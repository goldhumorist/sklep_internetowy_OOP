package com.company.Storage;

import com.company.Product.Product;
import com.company.UserInterface.Loger;

public class StorehouseProxy extends Storehouse{

    Loger loger;
    public StorehouseProxy (Loger loger){
        this.loger=loger;
    }
    @Override
    public void addNewProduct(Product product) {
        products.add(product);
        loger.ShowInfoLoger("Added new Product -> " + product.getTypeOfProduct() +" model: "+ product.getProductName());
    }

    @Override
    public void removeAllProductsFromStore() {
        products.clear();

        if (products.isEmpty()) {
            loger.ShowInfoLoger("removed all products from shop");
        }else loger.ShowInfoLoger("removing was not successful");
    }

    @Override
    public void showAllProduct() {
        loger.ShowInfoLoger("All Product");
        workWithCSVFile.showAllProductCSV();
    }

}




















