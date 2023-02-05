package az.expressbank.liststocks.entity;


import az.expressbank.liststocks.enums.AccountTypes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "accounts")
public class UserCashAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private AccountTypes accountTypes;

    private Double balance;
}
