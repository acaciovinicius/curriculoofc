package com.example.curriculo.controller;

import com.example.curriculo.model.Curriculo;
import com.example.curriculo.repository.CurriculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curriculos")
public class CurriculoController {

    @Autowired
    private CurriculoRepository repository;

    @GetMapping
    public List<Curriculo> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Curriculo criar(@RequestBody Curriculo curriculo) {
        return repository.save(curriculo);
    }
}
