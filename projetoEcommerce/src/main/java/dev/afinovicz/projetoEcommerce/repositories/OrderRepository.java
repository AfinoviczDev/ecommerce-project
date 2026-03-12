package dev.afinovicz.projetoEcommerce.repositories;

import dev.afinovicz.projetoEcommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
