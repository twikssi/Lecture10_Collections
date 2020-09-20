package by.andrey.twikssi.exer3library.service;

import by.andrey.twikssi.exer3library.bean.Product;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> shopProducts;

    public Shop() {
        shopProducts = new ArrayList<>();
    }

    public Shop(List<Product> products) {
        this.shopProducts = products;
    }

    public List<Product> getShopProducts() {
        return shopProducts;
    }

    public void addProduct(Product product){
        shopProducts.add(product);
    }
}
