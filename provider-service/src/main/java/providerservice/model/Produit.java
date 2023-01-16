package providerservice.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Produit {
    private Long id;
    private String leb;
    private String description;
}
