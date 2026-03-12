package dev.afinovicz.projetoEcommerce.services;

import dev.afinovicz.projetoEcommerce.entities.User;
import dev.afinovicz.projetoEcommerce.repositories.UserRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepositoy repositoy;

    public List<User> findAll() {
        return repositoy.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repositoy.findById(id);
        return obj.get();
    }


}
