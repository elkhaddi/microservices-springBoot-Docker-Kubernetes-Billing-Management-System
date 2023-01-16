package produitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import produitservice.model.Produit;
import produitservice.repository.ProduitRepository;

import java.util.List;

@RestController
@RequestMapping("/api/produit-service")
public class ProduitController {
    @Autowired
    private ProduitRepository produitRepository;

    @PostMapping("/new")
    @ResponseBody
    public Produit addProduit(@RequestBody Produit produit){
        return produitRepository.save(produit);
    }

    @GetMapping("/produit/{id}")
    @ResponseBody
    public Produit getProduit(@PathVariable Long id){
        return produitRepository.findById(id).orElseThrow(()->new RuntimeException("no product foubd for this id: "+id));
    }

    @GetMapping("/produits")
    @ResponseBody
    public List<Produit> getAllProduits(){
        return produitRepository.findAll();
    }
}
