package com.application.library.controller;

import com.application.library.entity.Category;
import com.application.library.service.BookService;
import com.application.library.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
   private CategoryService categoryService;


    @GetMapping("/categories")
    public String findAllCategories(Model model){
        List<Category> categories = categoryService.findAllCategories();
        model.addAttribute("categories",categories);
        return "categories";


    }



}
