package com.demo.paskafka.event.consumer;

import com.demo.paskafka.constant.KafkaTopics;
import com.demo.paskafka.event.message.PasMessage;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PasConsumer {

    @KafkaListener(topics = KafkaTopics.EVENTS_PAS)
    public void consume(ConsumerRecord<String, PasMessage> consumerRecord) {
        log.info("************ Message Received ************");
        PasMessage message = consumerRecord.value();
        log.info("Key: " + consumerRecord.key());
        log.info("ID: " + message.getId());
        log.info("Name: " + message.getName());
    }
}
