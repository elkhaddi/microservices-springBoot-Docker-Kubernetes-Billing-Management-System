package gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
	@GetMapping("/clientFallBack")
	public String clientFallBackMethod(){
		return "le srvice-client prend beaucoup de temps pour repondre. Veuillez ressayer ulterieurement..";
	}

	@GetMapping("/produitFallBack")
	public String produitFallBackMethod(){
		return "le srvice-produit prend beaucoup de temps pour repondre. Veuillez ressayer ulterieurement..";
	}

	@GetMapping("/facturationFallBack")
	public String facturationFallBackMethod(){
		return "le srvice-facturation prend beaucoup de temps pour repondre. Veuillez ressayer ulterieurement..";
	}

	@GetMapping("/providerFallBack")
	public String providerFallBackMethod(){
		return "le srvice-provider prend beaucoup de temps pour repondre. Veuillez ressayer ulterieurement..";
	}
}
