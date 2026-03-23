package dev.afinovicz.ecommerce_project.controllers;

import dev.afinovicz.ecommerce_project.dto.ProductDTO;
import dev.afinovicz.ecommerce_project.entities.Product;
import dev.afinovicz.ecommerce_project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable Long id) {
       return productService.findById(id);
    }

}
