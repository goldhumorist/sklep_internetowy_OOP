package com.company;

import com.company.Client.CorporateClient;
import com.company.Client.DefaultClient;
import com.company.Product.Product;
import com.company.Storage.Storehouse;

public class ElectronicsShop {

    public DefaultClient createDefaultClient() {
        System.out.println("creating new Default Client");
        return new DefaultClient();
    }


    public CorporateClient createCorporateClient() {
        System.out.println("creating new Corporate Client");
        return new CorporateClient();
    }
    private Storehouse storehouse;

    public ElectronicsShop(Storehouse storehouse) {
        this.storehouse = storehouse;
    }

    public void addNewProduct(Product product){
        storehouse.addNewProduct(product);
    }
    public void removeAllProductsFromStore(){
        storehouse.removeAllProductsFromStore();
    }
    public void showAllProduct(){
        storehouse.showAllProduct();
    }
}
