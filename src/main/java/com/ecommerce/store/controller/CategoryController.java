package com.ecommerce.store.controller;


import com.ecommerce.store.model.Category;
import com.ecommerce.store.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    // This section wires the controller to the services
    @Autowired
    CategoryService categoryService;

    // We are creating a category section in the database with this request method
    @PostMapping("/create")
    public String createCategory(@RequestBody Category category){

        categoryService.createCategory(category);
        return "Success";
    }


}
