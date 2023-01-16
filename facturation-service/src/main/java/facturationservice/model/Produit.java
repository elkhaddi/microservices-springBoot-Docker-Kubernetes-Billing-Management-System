package facturationservice.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Produit {
    private Long id;
    private String leb;
    private String description;
}
