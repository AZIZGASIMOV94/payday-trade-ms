package az.expressbank.deposit.service;

import az.expressbank.deposit.dto.UserCashAccountDto;

import java.util.Optional;

public interface DepositCashAccountServiceInter {
    Optional<UserCashAccountDto> updateUserCashAccount(Long id, Double addedBalance);
}
