package az.expressbank.notification.config.consumer;

import az.expressbank.notification.config.service.SendMailServiceInter;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import org.apache.kafka.common.TopicPartition;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Component
@RequiredArgsConstructor
public class UserOrderMailConsumer {

    private final SendMailServiceInter sendMailServiceInter;

    private final KafkaConsumer<String, String> kafkaConsumer;

    @EventListener(ApplicationReadyEvent.class)
    @SneakyThrows
    public void initConsumer() {

        kafkaConsumer.subscribe(Arrays.asList("process-user-order-events"));
        AtomicInteger counter = new AtomicInteger(0);

        while (true) {
            ConsumerRecords<String, String> records = kafkaConsumer.poll(Duration.ofMillis(100));
            for (ConsumerRecord<String, String> record : records) {

                sendMailServiceInter.send(record.value(), " you bought stock of: "+ record.key(), "Congrats you order has been carried out you " +
                        "purchased the stock of " + record.key());

                Map<TopicPartition, OffsetAndMetadata> commitOffset = new HashMap<>();
                TopicPartition topicPartition = new TopicPartition("process-user-order-events", 0);
                OffsetAndMetadata offsetAndMetadata = new OffsetAndMetadata(record.offset());
                commitOffset.put(topicPartition, offsetAndMetadata);
                kafkaConsumer.commitSync(commitOffset);
            }
        }
    }
}
