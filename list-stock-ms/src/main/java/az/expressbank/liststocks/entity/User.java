package az.expressbank.liststocks.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToMany(cascade = CascadeType.ALL)
    private List<UserCashAccount> userCashAccounts;


    /*private String password;

    private String email;*/
}
