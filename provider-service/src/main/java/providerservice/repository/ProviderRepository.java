package providerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;
import providerservice.model.Provider;

import java.util.List;

public interface ProviderRepository extends JpaRepository<Provider,Long> {
    public List<Provider> findByProduitId(@PathVariable Long id);
}
