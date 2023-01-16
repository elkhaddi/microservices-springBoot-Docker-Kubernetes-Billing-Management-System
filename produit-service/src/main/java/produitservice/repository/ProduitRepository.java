package produitservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import produitservice.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
