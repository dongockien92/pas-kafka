package com.demo.paskafka.event.producer;

import com.demo.paskafka.event.message.PasMessage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
@Slf4j
@AllArgsConstructor
public class PasProducer {
    private final StreamBridge streamBridge;

    public void produce(String name) {
        final PasMessage message = new PasMessage(UUID.randomUUID().toString(), name);
        log.info("************ Message Produced ************");
        log.info("ID: " + message.getId());
        log.info("Name: " + message.getName());
        this.streamBridge.send("producer-out-0", message);
    }
}
