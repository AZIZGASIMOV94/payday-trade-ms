package io.github.azizgasimov94.payday.liststocks.dto;

import io.github.azizgasimov94.payday.liststocks.entity.Order;
import io.github.azizgasimov94.payday.liststocks.entity.UserCashAccount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {

    private Long id;

    private String firstName;

    private String lastName;

    private List<Order> orders;

    private List<UserCashAccount> userCashAccounts;

}
