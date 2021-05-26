package com.company.Storage;

import com.company.Product.Product;
import com.company.UserInterface.WorkWithCSVFile;

import java.util.ArrayList;
import java.util.List;

public abstract class Storehouse {
     protected List<Product> products = new ArrayList<>();
     WorkWithCSVFile workWithCSVFile = new WorkWithCSVFile();

    public abstract void addNewProduct(Product product);

    public abstract void removeAllProductsFromStore();

    public abstract void showAllProduct();

}
