package dev.afinovicz.projetoEcommerce.services;

import dev.afinovicz.projetoEcommerce.entities.Category;
import dev.afinovicz.projetoEcommerce.entities.User;
import dev.afinovicz.projetoEcommerce.repositories.CategoryRepository;
import dev.afinovicz.projetoEcommerce.repositories.UserRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }


}
