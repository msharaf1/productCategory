package com.msx.productCategory.services;

import com.msx.productCategory.models.Category;
import com.msx.productCategory.repositories.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo){
        this.categoryRepo = categoryRepo;
    }

    public List<Category> getAllCategory(){
        return categoryRepo.findAll();
    }

    public Optional<Category> getCategoryById(Long id){
        return categoryRepo.findById(id);
    }

    public void addCategory(Category category){
         categoryRepo.save(category);
    }

    public void updateCategory(Category category){
        categoryRepo.save(category);
    }

    public void deletCategory(Long id){
        categoryRepo.deleteById(id);
    }
}
