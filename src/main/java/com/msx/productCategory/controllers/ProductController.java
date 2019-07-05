package com.msx.productCategory.controllers;

import com.msx.productCategory.models.CategoriesProducts;
import com.msx.productCategory.models.Category;
import com.msx.productCategory.models.Product;
import com.msx.productCategory.services.CategoriesProductsService;
import com.msx.productCategory.services.CategoryService;
import com.msx.productCategory.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    private CategoryService categoryService;
    private CategoriesProductsService cPS;

    public ProductController(ProductService productService, CategoryService categoryService, CategoriesProductsService cPS){
        this.productService = productService;
        this.categoryService = categoryService;
        this.cPS = cPS;
    }

    @GetMapping("")
    public String showAll(Model model){
//        List<Product> pList = productService.findAllProducts();
        model.addAttribute("productList", productService.findAllProducts());
        return "index";
    }
//    @GetMapping("/show")
//    public String showProduct(Model model){
//        List<Product> pList = productService.findAllProducts();
//        model.addAttribute("productList", productService.findAllProducts());
//        return "showProducts";
//    }
    @GetMapping("/new")
    public String addProduct(@ModelAttribute("productObj") Product product){
        return "newProduct";
    }

    @PostMapping("/new")
    public String saveProduct(@Valid @ModelAttribute("productObj") Product product, BindingResult result){
            if(result.hasErrors()){
                return "newProduct";
            }else{
                productService.addProduct(product);
                return "redirect:/products";
            }
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id, @ModelAttribute("catProduct") CategoriesProducts categoriesProducts,
                                 Model model){
        model.addAttribute("product", cPS.getProductById(id));
        model.addAttribute("productList", productService.findAllProducts());
        List<Category> categoriesList = categoryService.getAllCategory();
        model.addAttribute("categoriesList", categoriesList);

        System.out.println("Cat Name: "+ categoriesProducts.getCategory().getName());
//        CategoriesProducts cP = cP
        return "showProducts";



    }

    @PostMapping("/addcat")
    public String postProductById(@Valid @ModelAttribute("catProduct") CategoriesProducts categoriesProducts,
                                  BindingResult result){
//                                  @PathVariable("id") Long id,){
//        Optional<CategoriesProducts>
            cPS.saveCategoryProduct(categoriesProducts);
        System.out.println("Cat Name: "+ categoriesProducts.getCategory().getName());
        return "redirect:/products";
    }

}//classs
