package com.application.library.controller;

import com.application.library.entity.Category;
import com.application.library.service.BookService;
import com.application.library.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @GetMapping("/categories")
    public String findAllCategories(Model model) {
        List<Category> categories = categoryService.findAllCategories();
        model.addAttribute("categories", categories);
        return "categories";


    }

    @GetMapping("/remove-category/{id}")
    public String deleteCategory(@PathVariable Long id, Model model) {
        categoryService.deleteCategoryById(id);
        model.addAttribute("categories", categoryService.findAllCategories());
        return "categories";

    }

    @GetMapping("update-category/{id}")
    public String updateCategory(@PathVariable Long id,Model model){
        model.addAttribute("category",categoryService.findCategoryById(id));
        return "update-category";


    }

    @PostMapping("update-category/{id}")
    public String saveCategory(@PathVariable Long id, Category category, BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "update-category";
        }
        categoryService.updateCategory(category);
        model.addAttribute("categories",categoryService.findAllCategories());
        return "redirect:/categories";

    }


}
