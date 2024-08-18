package com.dev.casta.SpringCrud.controller;

import com.dev.casta.SpringCrud.entities.Auto;
import com.dev.casta.SpringCrud.service.IAutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/autos")
public class AutoController {

    @Autowired
    private IAutoService autoService;

    @PostMapping("/cars")
    public ResponseEntity<Auto> createAuto(@RequestBody Auto auto) {
        Auto savedAuto = autoService.save(auto);
        return new ResponseEntity(savedAuto, HttpStatus.CREATED);
    }
}
