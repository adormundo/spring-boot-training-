package com.alrz.cursomc.services;

import com.alrz.cursomc.entities.CategoriaEntity;
import com.alrz.cursomc.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    final CategoriaRepository REPOSITORY;

    public CategoriaService(CategoriaRepository repository) {
        REPOSITORY = repository;
    }

    public CategoriaEntity findById(Long id) {
        Optional<CategoriaEntity> find = REPOSITORY.findById(id);
        return find.orElse(null);
    }
}