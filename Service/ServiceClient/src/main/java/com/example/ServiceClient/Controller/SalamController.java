package com.example.ServiceClient.Controller;

import com.example.ServiceClient.Model.Client;
import com.example.ServiceClient.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalamController {

    @Autowired
    private ClientRepository repo;

    @GetMapping("/Salam")
    public String getSalam(){
        return "Salam Chabab";
    }

    @GetMapping("/clients")
    public List<Client> getClients(){
        return repo.findAll();
    }

    @GetMapping("/clients/{id}")
    public Client getClients(@PathVariable  Long id) throws Exception {
        return repo.findById(id).orElseThrow(()->new Exception("Client inexistant") );
    }
}
