package providerservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "provider")
public class Provider {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company_name;
    private String email;
    @JsonIgnore
    private Long produitId;
}
