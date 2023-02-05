package az.expressbank.order;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Random;

@SpringBootApplication
@RequiredArgsConstructor
public class UserOrderMsApplication implements CommandLineRunner {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private Random random = new Random();

    @Value(value = "${kafka.topic-name}")
    private String topicName;

    public static void main(String[] args) {
        SpringApplication.run(UserOrderMsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Thread.sleep(1000);
        kafkaTemplate.send(topicName, "APPL", "aziz.gasimov@gmail.com");
        Thread.sleep(500);
        kafkaTemplate.send(topicName, "GGL",  "aziz.emilov@gmail.com");
        Thread.sleep(200);
        kafkaTemplate.send(topicName, "TSLA", "aziz.rasullu@gmail.com");
        Thread.sleep(150);
        kafkaTemplate.send(topicName, "AMZN", "emingasimov88@mail.ru");

    }
}
