package com.msx.productCategory.services;

import com.msx.productCategory.models.Product;
import com.msx.productCategory.repositories.ProductRepo;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    public List<Product> findAllProducts(){
        return productRepo.findAll();
    }

    public Optional<Product> getById(Long id){
        if(!productRepo.findById(id).isPresent()){
            return null;
        }
        return productRepo.findById(id);
    }

    public void addProduct(Product product){
        productRepo.save(product);
    }

    public void updateProduct(Product product){
        productRepo.save(product);
    }

    public void deleteProduct(Long id){
        productRepo.deleteById(id);
    }



}
