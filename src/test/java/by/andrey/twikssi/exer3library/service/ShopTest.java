package by.andrey.twikssi.exer3library.service;

import by.andrey.twikssi.exer3library.bean.Product;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {
    Product product;
    Shop shop;

    @Before
    public void setup(){
        List<Product> listProduct = new ArrayList<>();
        listProduct.add( new Product("Anton", new BigDecimal(14.56)));
        listProduct.add( new Product("Chair", new BigDecimal(20.80)));
        listProduct.add( new Product("BubbleGum", new BigDecimal(4.06)));
        listProduct.add( new Product("Dvd", new BigDecimal(6.90)));
        listProduct.add( new Product("Poncho", new BigDecimal(88.90)));
        listProduct.add( new Product("Bear", new BigDecimal(24.45)));

        shop = new Shop(listProduct);
    }

    @Test
    public void addProduct() {
        Product iphon = new Product("Iphon 100000", new BigDecimal(9999.99));
        shop.addProduct(iphon);
        shop.addProduct(new Product("HeadMainOfGoverment", new BigDecimal(0.11)));

        assertEquals(8, shop.getListProducts().size());
        assertEquals("Iphon 100000",shop.getListProducts().get(6).getName());
    }

    @Test
    public void deleteProduct() {
        Product bear = new Product("Bear", new BigDecimal(24.45));
        shop.deleteProduct(bear);

        for (Product product: shop.getListProducts()){
            assertFalse(product.equals(bear));
        }
    }

    @Test
    public void findOutProductWithName() {
        Product bear = new Product("Bear", new BigDecimal(24.45));

        assertEquals(bear, shop.findOutProductWithName("bear"));
    }

    @Test
    public void findProduct() {
        assertEquals(3,shop.findProduct(new BigDecimal(20), new BigDecimal(90)).size());
    }
}