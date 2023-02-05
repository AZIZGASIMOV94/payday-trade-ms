package az.expressbank.notification.config.mail;

import az.expressbank.notification.config.service.SendMailServiceInter;
import lombok.SneakyThrows;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.common.TopicPartition;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MailProcessor implements Runnable {


    private ConsumerRecords<String, String> records;
    private AtomicInteger counter;
    private KafkaConsumer<String, String> consumer;
    private SendMailServiceInter sendMailServiceInter;

    public MailProcessor(KafkaConsumer<String, String> consumer,
                         ConsumerRecords<String, String> records,
                         SendMailServiceInter sendMailServiceInter
            /*AtomicInteger counter*/) {
        this.records = records;
        this.consumer = consumer;
        this.sendMailServiceInter = sendMailServiceInter;
        //this.counter = counter;
    }

    @Override
    @SneakyThrows
    public void run() {

        while (true) {
            for (ConsumerRecord<String, String> record : records) {
                System.out.println("Receive message: " + record.value() + ", Partition: "
                        + record.partition() + ", Offset: " + record.offset() + ", by ThreadID: "
                        + Thread.currentThread().getId());
            }
        }
/*        System.out.println("Receive message: " + record.value() + ", Partition: "
                + record.partition() + ", Offset: " + record.offset() + ", by ThreadID: "
                + Thread.currentThread().getId());
        counter.incrementAndGet();
        Thread.sleep(1000);
        System.out.println("Processing....");

        Map<TopicPartition, OffsetAndMetadata> commitOffset = new HashMap<>();
        TopicPartition topicPartition = new TopicPartition(record.topic(), record.partition());
        OffsetAndMetadata offsetAndMetadata = new OffsetAndMetadata(record.offset());
        commitOffset.put(topicPartition, offsetAndMetadata);
        System.out.println("Committing offset " + commitOffset);
        consumer.commitSync(commitOffset);
        System.out.println("Committed");*/
    }
}
