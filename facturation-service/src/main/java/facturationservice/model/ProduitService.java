package facturationservice.model;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "produit-service")
public interface ProduitService {
    @GetMapping("/api/produit-service/produit/{id}")
    public Produit findProduitById(@PathVariable Long id);
}
