package dev.afinovicz.ecommerce_project.services;

import dev.afinovicz.ecommerce_project.dto.ProductDTO;
import dev.afinovicz.ecommerce_project.entities.Product;
import dev.afinovicz.ecommerce_project.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        ProductDTO productDTO = new ProductDTO(product);
        return productDTO;
    }

}
