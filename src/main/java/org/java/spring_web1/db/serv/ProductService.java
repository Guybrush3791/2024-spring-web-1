package org.java.spring_web1.db.serv;

import java.util.List;
import java.util.Optional;

import org.java.spring_web1.db.pojo.Product;
import org.java.spring_web1.db.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Optional<Product> getProductById(int id) {
        return productRepo.findById(id);
    }

    public void save(Product product) {

        productRepo.save(product);
    }

    public void delete(Product product) {

        productRepo.delete(product);
    }
}
