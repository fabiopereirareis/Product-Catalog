package com.digitalinnovationone.santander.productcatalog.controller;

import com.digitalinnovationone.santander.productcatalog.model.Product;
import com.digitalinnovationone.santander.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product save(@RequestBody Product product){
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Long id){
        return productRepository.findById(id);
    }
}
