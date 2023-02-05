package az.expressbank.deposit.repository;


import az.expressbank.deposit.entity.UserCashAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserCashAccountCustomRepository extends JpaRepository<UserCashAccount, Long> {

    @Query(value = "select a.id, a.account_types, a.balance from users as u " +
            "inner join users_user_cash_accounts uca on uca.user_id = u.id " +
            "inner join accounts a on uca.user_cash_accounts_id = a.id where u.id = ?1", nativeQuery = true)
    Optional<UserCashAccount> getUserCashAccountById(Long id);

    @Modifying
    @Query(value = "update accounts a set a.balance = ?1 where a.id = ?2", nativeQuery = true)
    void updateUserCashAccount(Double balance, Long id);
}
