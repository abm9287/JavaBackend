package com.store.store.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/client/")
@CrossOrigin("{*}")
public class ClientContoller {
    //Inserta el servicio
    @Autowired
    private ClientService clientService;

    //Método Create
    @PostMapping("/")
    public Client save(@RequestBody Client entity)
    {
        return clientService.save(entity);
    }

    //Método Select
    @GetMapping("/{id}/")
    public Client findById(@PathVariable long id)
    {
        return clientService.findById(id);
    }

    //Método update
    @PutMapping ("/")
    public Client update(@RequestBody Client entity)
    {
        return clientService.save(entity);
    }
}
