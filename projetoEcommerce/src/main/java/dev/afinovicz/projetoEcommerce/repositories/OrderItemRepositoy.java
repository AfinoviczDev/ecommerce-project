package dev.afinovicz.projetoEcommerce.repositories;

import dev.afinovicz.projetoEcommerce.entities.OrderItem;
import dev.afinovicz.projetoEcommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepositoy extends JpaRepository<OrderItem, Long> {
}
