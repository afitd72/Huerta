package com.udem.huerto.services;

import com.udem.huerto.entity.Products;
import com.udem.huerto.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsServices {
    @Autowired
    private ProductsRepository productsRepository;

    public List<Products> findAll(){
        return productsRepository.findAll();
    }

    public Optional<Products> findById(int idProduct){
        return productsRepository.findById(idProduct);

    }

    public void save (Products products){
        productsRepository.save(products);

    }

    public void delete (Products products){
        productsRepository.delete(products);

    }

    public void update (Products products){
        //productsRepository.update(products);

    }
}
