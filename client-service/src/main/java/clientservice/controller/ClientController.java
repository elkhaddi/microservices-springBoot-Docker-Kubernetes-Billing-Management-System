package clientservice.controller;

import clientservice.model.Client;
import clientservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client-service")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @PostMapping("/add-new")
    @ResponseBody
    public Client addNewClient(@RequestBody Client client){
        return clientRepository.save(client);
    }

    @GetMapping("/client/{id}")
    @ResponseBody
    public Client findClient(@PathVariable Long id){
        return clientRepository.findById(id).orElseThrow(()->new RuntimeException("client not found for this id :"+id));
    }

    @GetMapping("/clients")
    @ResponseBody
    public List<Client> getAll(){
        return clientRepository.findAll();
    }
}
