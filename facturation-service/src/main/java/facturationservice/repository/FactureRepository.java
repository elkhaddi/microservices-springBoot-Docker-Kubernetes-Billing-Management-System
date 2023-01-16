package facturationservice.repository;

import facturationservice.model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture,Long> {
    public List<Facture> findByClientId(@PathVariable Long id);
}
