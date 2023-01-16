package facturationservice.controller;

import facturationservice.model.*;
import facturationservice.repository.FactureRepository;
import facturationservice.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturation-service")
public class FacturationController {
    @Autowired
    private FactureRepository factureRepository;
    @Autowired
    private ProductItemRepository productItemRepository;
    @Autowired
    private ProduitService produitService;
    @Autowired
    private ClientService clientService;

    @PostMapping("/new-facture/{clientId}")
    @ResponseBody
    public Facture addFacture(@RequestBody Facture facture,@PathVariable Long clientId){
        Client c = clientService.findClientById(clientId);
        facture.setClientId(c.getId());
        return factureRepository.save(facture);
    }

    @GetMapping("/facture/{id}")
    @ResponseBody
    public Facture getFactureDetails(@PathVariable Long id){
        return factureRepository.findById(id).orElseThrow(()->new RuntimeException("facture not found for this id: "+id));
    }

    @GetMapping("/factures/{idclient}")
    @ResponseBody
    public List<Facture> getClientFactures(@PathVariable Long idclient){
        return factureRepository.findByClientId(idclient);
    }

    @PostMapping("/new-pi/{idfacture}/{idproduit}")
    @ResponseBody
    public ProductItem addNewProductItem(@RequestBody ProductItem productItem,@PathVariable Long idproduit,@PathVariable Long idfacture){
        Produit p = produitService.findProduitById(idproduit);
        Facture f = factureRepository.findById(idfacture).orElseThrow(()->new RuntimeException("facture not found for this id: "+idfacture));
        productItem.setProductId(p.getId());
        productItem.setFacture(f);
        return productItemRepository.save(productItem);
    }
}
