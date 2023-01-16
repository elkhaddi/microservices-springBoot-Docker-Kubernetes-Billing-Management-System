package facturationservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product_item")
public class ProductItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private double prix;
    private int quatite;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facture_id",referencedColumnName = "id")
    @JsonIgnore
    private Facture facture;
}
