package com.nirmayi.simpleWebApp.service;

import com.nirmayi.simpleWebApp.model.Product;
import com.nirmayi.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    //List<Product> products = new ArrayList<>(Arrays.asList(new Product("Pen",100,20000),new Product("Pencil",101,30000)));

    public List<Product> getProducts(){

       return repo.findAll();
    }

    public Product getProductById(int prodId){
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
