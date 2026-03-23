package dev.afinovicz.ecommerce_project.repositories;

import dev.afinovicz.ecommerce_project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
