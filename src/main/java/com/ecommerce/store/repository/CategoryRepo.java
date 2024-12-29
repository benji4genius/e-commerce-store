package com.ecommerce.store.repository;

import com.ecommerce.store.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {
    Category findByCategoryName(String categoryName);// This is called by redCategory method in categoryController class

}