package az.expressbank.liststocks;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ListStockMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListStockMsApplication.class, args);
    }

}
