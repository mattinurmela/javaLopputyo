package com.store.productapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.store.productapp.data.Product;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService(){
        products = Arrays.asList(
            new Product("Samsung", 200, 12345),
            new Product("Iphone", 400, 23456),
            new Product("OnePlus", 350, 34567),
            new Product("Nokia", 150, 45678)
        );
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> getProducts(){
        return new ArrayList<>(products);
    }

    /*
     * 
     * 
     */

    public Product findProduct(int id){
        for (Product product : products) {
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public boolean removeProduct(int id){
        Product p = findProduct(id);

        if(p != null){
            return products.remove(p);
        }
        return false;
    }
}
