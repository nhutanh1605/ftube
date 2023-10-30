package ftube.ftube.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Authorities",uniqueConstraints = {
        @UniqueConstraint(columnNames = {"Userid", "Roleid"})
})
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  UUID uuid;

    @ManyToOne  @JoinColumn(name = "Userid")
    private User user;
    @ManyToOne  @JoinColumn(name = "Roleid")
    private Role role;
}
