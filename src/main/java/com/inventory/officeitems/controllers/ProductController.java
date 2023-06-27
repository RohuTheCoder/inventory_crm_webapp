package com.inventory.officeitems.controllers;

import com.inventory.officeitems.product.Product;
import com.inventory.officeitems.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableJpaRepositories
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping({ "/" })
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

    @GetMapping({ "/list" })
    public ModelAndView getAllProoducts() {
        ModelAndView mav = new ModelAndView("list-products");
        mav.addObject("products", productRepository.findAll());
        return mav;
    }

    @GetMapping({ "/add" })
    public ModelAndView addProductForm() {
        ModelAndView mav = new ModelAndView("add-product-form");
        Product newProduct = new Product();
        mav.addObject("product", newProduct);
        return mav;
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute @Validated Product product) {
         boolean isExistingProduct = productRepository.existsById(product.row_id);

         if (isExistingProduct) {
            return "error";
        }
        // System.out.println(product.getRow_id());
        try {
            // System.out.println("*************"+product.toString());
            productRepository.save(product);
        } catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        return "save-success";
    }

    @PostMapping("/edit/save")
    public String editProduct(@ModelAttribute @Validated Product product) {
        try {
            productRepository.save(product);
        } 
        catch (Exception e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        return "update-success";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Integer row_id) {
        ModelAndView mav = new ModelAndView("edit-product-form");
        Product product = productRepository.findById(row_id).get();
        mav.addObject("product", product);
        return mav;
    }

    @GetMapping({ "/update" })
    public ModelAndView updateForm() {
        ModelAndView mav = new ModelAndView("update-product-form");
        mav.addObject("products", productRepository.findAll());
        return mav;
    }

    @GetMapping("/deleteProduct")
    public String deleteProduct(@RequestParam Integer row_id) {
        productRepository.deleteById(row_id);
        return "delete-success";
    }

    @GetMapping({ "/delete" })
    public ModelAndView deleteForm() {
        ModelAndView mav = new ModelAndView("delete-product-form");
        mav.addObject("products", productRepository.findAll());
        return mav;
    }
}
