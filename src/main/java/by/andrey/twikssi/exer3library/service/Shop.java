package by.andrey.twikssi.exer3library.service;

import by.andrey.twikssi.exer3library.bean.Product;

import java.math.BigDecimal;
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

    public void deleteProduct(Product product){
        listProducts.remove(product);
    }

    public Product findOutProductWithName(String name){
        for(Product product:listProducts){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;
    }

    public List<Product> findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange){
        List<Product> listWithRangeProducts = new ArrayList<>();
        for(Product product:listProducts){
            if(product.getPrice().doubleValue() > minPriceRange.doubleValue() && product.getPrice().doubleValue() < maxPriceRange.doubleValue()){
                listWithRangeProducts.add(product);
            }
        }
        return listWithRangeProducts;
    }
}
