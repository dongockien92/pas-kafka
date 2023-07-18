package com.demo.paskafka.event.producer;

import com.demo.paskafka.constant.KafkaTopics;
import com.demo.paskafka.event.message.PasMessage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
@Slf4j
@AllArgsConstructor
public class PasProducer {
    private final KafkaTemplate<String, PasMessage> kafkaTemplate;

    public void produce(String name) {
        final PasMessage message = new PasMessage(UUID.randomUUID().toString(), name);
        log.info("************ Message Produced ************");
        log.info("ID: " + message.getId());
        log.info("Name: " + message.getName());
        this.kafkaTemplate.send(KafkaTopics.EVENTS_PAS, message);
    }
}
