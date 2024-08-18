package com.dev.casta.SpringCrud.service;

import com.dev.casta.SpringCrud.entities.Auto;

import java.util.Optional;


public interface IAutoService {
    Auto save(Auto auto);
    Optional<Auto> getById(Long id);
    Auto update(Long id, double nuevoPrice);
    boolean delete(Long id);

}
