package com.ecommerce.store.service;

import com.ecommerce.store.model.Category;
import com.ecommerce.store.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepo categoryRepo;
    public void createCategory(Category category){
        categoryRepo.save(category);

    }

    public List<Category> listCategory(){
      return categoryRepo.findAll();

    }
    /* This method is called the categoryController class, and it uses to
    execute the category and if you look closely this is a direct replica of
    the category entity in the model, and it is being called by calling the getters,
     and the setter methods in the category in the model folder*/
    
    public void editCategory(int categoryId, Category updateCategory) {
        Category category = categoryRepo.getById(categoryId);
        category.setCategoryName(updateCategory.getCategoryName());
        category.setDescription(updateCategory.getDescription());
        category.setImageUrl(updateCategory.getImageUrl());
        categoryRepo.save(category);
    }
}
