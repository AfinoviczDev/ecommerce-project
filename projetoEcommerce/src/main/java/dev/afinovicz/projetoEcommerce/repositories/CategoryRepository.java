package dev.afinovicz.projetoEcommerce.repositories;

import dev.afinovicz.projetoEcommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
