package com.inventory.officeitems.controllers;

import com.inventory.officeitems.product.Product;
import com.inventory.officeitems.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@EnableJpaRepositories
public class ProductController{
    @Autowired
    private ProductRepository productRepository;

    
    @GetMapping({"/"})
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
    }

    @GetMapping({"/list"})
	public ModelAndView getAllProoducts() {
		ModelAndView mav = new ModelAndView("list-products");
		mav.addObject("products", productRepository.findAll());
		return mav;
    }

    @GetMapping({"/add"})
    public ModelAndView addProductForm() {
        ModelAndView mav = new ModelAndView("add-product-form");
        Product newProduct = new Product();
        mav.addObject("product", newProduct);
        return mav;
    }

    @PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute Product product) {
		productRepository.save(product);
		return "redirect:/list";
	}

    @GetMapping("/showUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam Integer row_id) {
		ModelAndView mav = new ModelAndView("add-product-form");
		Product product = productRepository.findById(row_id).get();
		mav.addObject("product", product);
		return mav;
	}

    @GetMapping({"/update"})
	public ModelAndView updateForm() {
		ModelAndView mav = new ModelAndView("update-product-form");
        mav.addObject("products", productRepository.findAll());
		return mav;
    }

    @GetMapping("/deleteProduct")
    public String deleteProduct(@RequestParam Integer row_id)
    {
        productRepository.deleteById(row_id);
        return "redirect:/list";
    }

    @GetMapping({"/delete"})
	public ModelAndView deleteForm() {
		ModelAndView mav = new ModelAndView("delete-product-form");
        mav.addObject("products", productRepository.findAll());
		return mav;
    }
}
