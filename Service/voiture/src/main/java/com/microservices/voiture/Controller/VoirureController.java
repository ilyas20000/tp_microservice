package com.microservices.voiture.Controller;

import com.microservices.voiture.Models.Client;
import com.microservices.voiture.Models.Voiture;
import com.microservices.voiture.Repository.VoitureRepository;
import com.microservices.voiture.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voitures")
public class VoirureController {

    @Autowired
    private VoitureRepository repo;

    @Autowired
    private ClientService clientService; // Inject the Feign Client

    @GetMapping
    public ResponseEntity<List<Voiture>> getVoitures() {
        List<Voiture> voitures = repo.findAll();

        // Fetch and set Client for each Voiture
        for (Voiture voiture : voitures) {
            Long clientId = voiture.getId_client();
            if (clientId != null) {
                Client client = clientService.clientById(clientId);
                voiture.setClient(client);
            }
        }

        return ResponseEntity.ok(voitures);
    }

    @GetMapping("/{idClient}")
    public ResponseEntity<List<Voiture>> getVoituresParClientId(@PathVariable("idClient") Long clientID) {
        List<Voiture> voitures = repo.findByClientId(clientID);

        // Fetch and set Client for each Voiture
        for (Voiture voiture : voitures) {
            Long clientId = voiture.getId_client();
            if (clientId != null) {
                Client client = clientService.clientById(clientId);
                voiture.setClient(client);
            }
        }

        return ResponseEntity.ok(voitures);
    }
}