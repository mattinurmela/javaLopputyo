package com.store.productapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.store.productapp.data.Product;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService(){
           products.add(new Product("Samsung", 200, 1));
           products.add(new Product("Iphone", 400, 2));
           products.add(new Product("OnePlus", 350, 3));
           products.add(new Product("Nokia", 150, 4));       
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> getProducts(){
        return new ArrayList<>(products);
    }

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

    public Product updateProduct(int id, String name, double price){

        Product up = findProduct(id);

        if (up != null){
            up.setName(name);
            up.setPrice(price);
            return up;
        }
        return null;
    }
}
