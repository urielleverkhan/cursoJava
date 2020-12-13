package com.spring.web.rest;

import com.spring.web.model.Jedi;
import com.spring.web.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JediResourse {
    @Autowired
    private JediRepository repository;

    @GetMapping("/api/jedi")
    public List<Jedi> getAllJedi(){
        return repository.findAll();
    }
}
