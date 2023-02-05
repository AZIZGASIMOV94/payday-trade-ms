package az.expressbank.liststocks.dto;

import az.expressbank.liststocks.entity.Order;
import az.expressbank.liststocks.entity.UserCashAccount;
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
