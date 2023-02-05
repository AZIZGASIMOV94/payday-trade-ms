package az.expressbank.liststocks;

import az.expressbank.liststocks.repository.OrdersRepository;
import az.expressbank.liststocks.repository.UserCashAccountRepository;
import az.expressbank.liststocks.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@RequiredArgsConstructor
public class ListStockMsApplication implements CommandLineRunner {

    private final OrdersRepository ordersRepository;
    private final UserCashAccountRepository userCashAccountRepository;
    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(ListStockMsApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

/*        UserCashAccount userCashAccount = UserCashAccount.builder()
                .accountTypes(AccountTypes.DEPOSIT_ACCOUNT)
                .balance(500D)
                .build();

        Order order = Order.builder()
                .orderDesc("AMAZON")
                .orderPrice(120D)
                .orderTypes(OrderTypes.BUY)
                .orderStatus(StatusTypes.DONE)
                .build();

        User newUser = User.builder()
                .firstName("SARKHAN")
                .lastName("GASIMOV")
                .userCashAccounts(List.of(userCashAccount))
                .orders(List.of(order))
                .build();

        userRepository.save(newUser);*/


    }
}
