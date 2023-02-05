package az.expressbank.deposit.dto;

import az.expressbank.deposit.enums.AccountTypes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCashAccountDto {

    private Long id;

    private AccountTypes accountTypes;

    private Double balance;

}
