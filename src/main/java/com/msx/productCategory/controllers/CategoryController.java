package com.msx.productCategory.controllers;

import com.msx.productCategory.models.Category;
import com.msx.productCategory.services.CategoryService;
import com.msx.productCategory.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {
    private CategoryService categoryService;
    private ProductService productService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("")
    public String showAllCategories(Model model){
        List<Category> categoryList = categoryService.getAllCategory();
        model.addAttribute("categoryList", categoryList);
        return "categories";
    }

    @GetMapping("/new")
    public String addCategory(@ModelAttribute("categoryObj") Category category){
        return "newCategory";
    }

    @PostMapping("/new")
    public String addCategory(@Valid @ModelAttribute("categoryObj") Category category, BindingResult result){
        if(result.hasErrors()) {
            return "newCategory";
        }else {
            categoryService.addCategory(category);
            return "redirect:/categories";
        }
    }

    @GetMapping("/categories/{id}")
    public String getCatById(@PathVariable("id") Long id){
        categoryService.getCategoryById(id);
        return "";
    }

}
