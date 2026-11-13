package io.github.azizgasimov94.payday.deposit.service;

import io.github.azizgasimov94.payday.deposit.dto.UserCashAccountDto;

import java.util.Optional;

public interface DepositCashAccountServiceInter {
    Optional<UserCashAccountDto> updateUserCashAccount(Long id, Double addedBalance);
}
