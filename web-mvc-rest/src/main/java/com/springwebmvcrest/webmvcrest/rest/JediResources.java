package com.springwebmvcrest.webmvcrest.rest;


import com.springwebmvcrest.webmvcrest.model.Jedi;
import com.springwebmvcrest.webmvcrest.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JediResources {

    @Autowired
    private JediRepository repository;

    public List<Jedi> getAllJediRest(){
        return repository.getAllJedi();
    }
}
