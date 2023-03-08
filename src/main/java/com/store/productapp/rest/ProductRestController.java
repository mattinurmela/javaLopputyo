package com.store.productapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.store.productapp.data.Product;
import com.store.productapp.service.ProductService;

@RestController
public class ProductRestController {
    
    @Autowired
    ProductService pc;
    
    public ProductRestController(ProductService pc){
        this.pc = pc;
    }
    

    @GetMapping("/products")
    public List<Product> getProducts(){
        return pc.getProducts();
    }

    @PostMapping("/product")
    public String addProduct(@RequestBody Product product){
        pc.addProduct(product);
        return "Product added";
    }

    @DeleteMapping("/product")
    public String deleteProduct(@RequestBody Product product){
        pc.removeProduct(product.getId());
        return "Product removed";
    }
    
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){
        Product p = pc.findProduct(id);

        if(p != null){
            return new ResponseEntity<>(p, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
