package io.github.azizgasimov94.payday.liststocks.dto;

import io.github.azizgasimov94.payday.liststocks.enums.AccountTypes;
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
