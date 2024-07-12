package org.java.spring_web1.web.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.java.spring_web1.db.pojo.Product;
import org.java.spring_web1.db.serv.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/test/add")
    public ResponseEntity<Void> addTestProduct() {

        Product p1 = new Product("Test Product 1", 100, 10);
        Product p2 = new Product("Test Product 2", 250, 40);
        Product p3 = new Product("Test Product 3", 500, 22);

        productService.save(p1);
        productService.save(p2);
        productService.save(p3);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {

        List<Product> products = productService.getAllProducts();

        return ResponseEntity.ok(products);
    }

}
