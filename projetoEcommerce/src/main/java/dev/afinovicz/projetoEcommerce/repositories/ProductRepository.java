package dev.afinovicz.projetoEcommerce.repositories;

import dev.afinovicz.projetoEcommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
