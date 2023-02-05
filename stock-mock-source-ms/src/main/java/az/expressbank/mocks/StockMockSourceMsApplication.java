package az.expressbank.mocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StockMockSourceMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockMockSourceMsApplication.class, args);
    }

}
