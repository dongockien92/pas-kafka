package com.demo.paskafka.event.consumer;

import com.demo.paskafka.event.message.PasMessage;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PasConsumer {
    @KafkaListener(topics = "${app.topic.0}")
    public void consumer(ConsumerRecord<String, PasMessage> consumerRecord) {
        final PasMessage message = consumerRecord.value();
        log.info("************ Message Received ************");
        log.info("ID: " + message.id());
        log.info("Name: " + message.name());
    }
}
