package dev.afinovicz.ecommerce_project.controllers;

import dev.afinovicz.ecommerce_project.dto.ProductDTO;
import dev.afinovicz.ecommerce_project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @GetMapping
    public Page<ProductDTO> findAll(Pageable pageable) {
        return productService.findAll(pageable);
    }

    @PostMapping("/")
    public ProductDTO create(@RequestBody ProductDTO dto) {
        return productService.insert(dto);
    }

}
