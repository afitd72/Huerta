package com.udem.huerto.controller;


import com.udem.huerto.entity.Products;
import com.udem.huerto.services.ProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductsController {
    @Autowired
    private ProductsServices productsServices;
    @GetMapping("/Products/(idProduct)")
    public List<Products> findAll(){
        return productsServices.findAll();

    }
    @GetMapping("/(idProduct)")
    public Optional<Products> findById(@PathVariable int idProduct){
        return productsServices.findById( idProduct);

    }
    @PostMapping("/")
    public void save (@RequestBody Products products){
        productsServices.save( products);

    }
    @DeleteMapping("/(idProduct)")
    public void delete (Products products){
        productsServices.delete(products);

    }
    @PutMapping("/(idProduct)")
    public void update (@RequestBody Products products, @PathVariable int idProduct){
        productsServices.update(products);

    }
}
