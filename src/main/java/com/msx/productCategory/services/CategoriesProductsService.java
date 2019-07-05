package com.msx.productCategory.services;

import com.msx.productCategory.models.CategoriesProducts;
import com.msx.productCategory.models.Category;
import com.msx.productCategory.models.Product;
import com.msx.productCategory.repositories.CategoriesProductRepo;
import com.msx.productCategory.repositories.CategoryRepo;
import com.msx.productCategory.repositories.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriesProductsService {
    private CategoriesProductRepo categoriesProductRepo;
    private CategoryRepo categoryRepo;
    private ProductRepo productRepo;

    public CategoriesProductsService(CategoriesProductRepo categoriesProductRepo, CategoryRepo categoryRepo, ProductRepo productRepo){
        this.categoriesProductRepo = categoriesProductRepo;
        this.categoryRepo = categoryRepo;
        this.productRepo = productRepo;
    }


    public void saveCategoryProduct(CategoriesProducts cP){
        categoriesProductRepo.save(cP);
    }


//Product and Categories services
    public Product saveProduct(Product product){
        return productRepo.save(product);
    }

    public Product getProductById(Long id){
        Optional<Product> optionalProduct = productRepo.findById(id);
        if(optionalProduct.isPresent()){
            return optionalProduct.get();
        } else{
            return null;
        }
    }

    public Category saveCategory(Category category){
        return categoryRepo.save(category);
    }

    public Category getCategoryById(Long id){
        Optional<Category> optionalCategory = categoryRepo.findById(id);
        if(optionalCategory.isPresent()){
            return optionalCategory.get();
        } else{
            return null;
        }
    }



}
