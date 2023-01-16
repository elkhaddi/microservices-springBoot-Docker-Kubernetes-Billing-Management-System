package facturationservice.model;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "client-service")
public interface ClientService {
    @GetMapping("/api/client-service/client/{id}")
    public Client findClientById(@PathVariable(name = "id") Long id);
}
