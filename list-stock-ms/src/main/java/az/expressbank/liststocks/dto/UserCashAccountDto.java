package az.expressbank.liststocks.dto;

import az.expressbank.liststocks.enums.AccountTypes;
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
