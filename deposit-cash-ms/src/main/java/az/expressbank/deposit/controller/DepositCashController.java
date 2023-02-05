package az.expressbank.deposit.controller;

import az.expressbank.deposit.dto.UserCashAccountDto;
import az.expressbank.deposit.service.DepositCashAccountServiceInter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/deposit")
public class DepositCashController {

    private final DepositCashAccountServiceInter depositCashAccountServiceInter;

    @PutMapping
    public ResponseEntity<UserCashAccountDto> getAllStocks(@RequestParam(value = "id") Long id,
                                                           @RequestParam(value = "amount") Double amount) {
        return ResponseEntity.of(depositCashAccountServiceInter.updateUserCashAccount(id, amount));
    }
}
