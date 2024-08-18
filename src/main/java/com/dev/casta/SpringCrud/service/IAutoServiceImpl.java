package com.dev.casta.SpringCrud.service;

import com.dev.casta.SpringCrud.entities.Auto;
import com.dev.casta.SpringCrud.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IAutoServiceImpl implements IAutoService{

    @Autowired
    private AutoRepository autoRepository;

    @Override
    public Auto save(Auto auto) {
        return this.autoRepository.save(auto);
    }

    @Override
    public Optional<Auto> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Auto update(Long id, double nuevoPrice) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
