package by.andrey.twikssi.exer3library.service;

import by.andrey.twikssi.exer3library.bean.Product;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> listProducts;

    public Shop() {
        listProducts = new ArrayList<>();
    }

    public Shop(List<Product> products) {
        this.listProducts = products;
    }

    public List<Product> getListProducts() {
        return listProducts;
    }

    public void addProduct(Product product){
        listProducts.add(product);
    }
}
