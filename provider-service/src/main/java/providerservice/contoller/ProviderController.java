package providerservice.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import providerservice.model.Produit;
import providerservice.model.ProduitService;
import providerservice.model.Provider;
import providerservice.repository.ProviderRepository;

import java.util.List;

@RestController
@RequestMapping("/api/provider-service")
public class ProviderController {

    @Autowired
    private ProviderRepository providerRepository;
    @Autowired
    private ProduitService produitService;

    @PostMapping("/new-provider/{idproduit}")
    @ResponseBody
    public Provider insertNew(@RequestBody Provider provider,@PathVariable Long idproduit){
        Produit p = produitService.findProduitById(idproduit);
        provider.setProduitId(p.getId());
        return providerRepository.save(provider);
    }
    @GetMapping("/all-providers")
    @ResponseBody
    public List<Provider> getall(){
        return providerRepository.findAll();
    }

    @GetMapping("/providers/{idproduit}")
    @ResponseBody
    public List<Provider> getProvidersDetails(@PathVariable Long idproduit){
        return providerRepository.findByProduitId(idproduit);
    }
}
