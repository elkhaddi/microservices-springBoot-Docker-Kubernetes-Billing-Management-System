package facturationservice.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client {
    private Long id;
    private String name;
    private String email;
    private String adr;
}
