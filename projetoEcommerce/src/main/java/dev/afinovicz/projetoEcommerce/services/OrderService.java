package dev.afinovicz.projetoEcommerce.services;

import dev.afinovicz.projetoEcommerce.entities.Order;
import dev.afinovicz.projetoEcommerce.entities.User;
import dev.afinovicz.projetoEcommerce.repositories.OrderRepository;
import dev.afinovicz.projetoEcommerce.repositories.UserRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repositoy;

    public List<Order> findAll() {
        return repositoy.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repositoy.findById(id);
        return obj.get();
    }


}
