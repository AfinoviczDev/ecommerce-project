package dev.afinovicz.projetoEcommerce.repositories;

import dev.afinovicz.projetoEcommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoy extends JpaRepository<User, Long> {
}
