package org.java.spring_web1.web.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.java.spring_web1.db.pojo.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {

    @GetMapping("/")
    public ResponseEntity<List<Product>> sayHello() {

        Product product1 = new Product("Laptop", 1000, 20);
        Product product2 = new Product("Phone", 500, 20);

        List<Product> products = List.of(product1, product2);

        return ResponseEntity.ok(products);
        // return ResponseEntity.badRequest().body(products);
    }

}
