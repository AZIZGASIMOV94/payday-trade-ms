package az.expressbank.deposit.service;

import az.expressbank.common.exception.ApplicationException;
import az.expressbank.deposit.dto.UserCashAccountDto;
import az.expressbank.deposit.entity.UserCashAccount;
import az.expressbank.deposit.enums.ErrorTypes;
import az.expressbank.deposit.repository.UserCashAccountCustomRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class DepositCashAccountServiceImpl implements DepositCashAccountServiceInter {

    private final UserCashAccountCustomRepository userCashAccountRepository;
    private final ModelMapper modelMapper;

    @Transactional
    @Override
    public Optional<UserCashAccountDto> updateUserCashAccount(Long id, Double addedBalance) {
        UserCashAccount userCashAccount = doesUserExists(id);

        Long userAccountId = userCashAccount.getId();

        UserCashAccount referenceById = userCashAccountRepository.getReferenceById(userAccountId);

        Double newBalance  = referenceById.getBalance() + addedBalance;
        Long cashAccountId = referenceById.getId();

        userCashAccountRepository.updateUserCashAccount(newBalance, cashAccountId);

        userCashAccount.setBalance(newBalance);

        UserCashAccountDto userCashAccountDto = modelMapper.map(userCashAccount, UserCashAccountDto.class);

        return Optional.of(userCashAccountDto);
    }

    private UserCashAccount doesUserExists(Long id){
        return userCashAccountRepository.getUserCashAccountById(id)
                .orElseThrow(() -> new ApplicationException(ErrorTypes.CASH_ACCOUNT_NOT_FOUND, Map.of("id", id)));
    }

}
