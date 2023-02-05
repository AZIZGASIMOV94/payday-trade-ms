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
        while (true) {
            Thread.sleep(1000);
            kafkaTemplate.send(topicName, "APPL", "gasimovaziz@gmail.com");
/*            Thread.sleep(500);
            kafkaTemplate.send(topicName, "GGL",  "gasimovaziz@gmail.com");
            Thread.sleep(200);
            kafkaTemplate.send(topicName, "TSLA", "gasimovaziz@gmail.com");
            Thread.sleep(150);
            kafkaTemplate.send(topicName, "AMZN", "gasimovaziz@gmail.com");*/
        }
    }
}
