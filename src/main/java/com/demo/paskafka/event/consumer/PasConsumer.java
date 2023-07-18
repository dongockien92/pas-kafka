package com.demo.paskafka.event.consumer;

import com.demo.paskafka.event.message.PasMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class PasConsumer implements Consumer<PasMessage> {
    @Override
    public void accept(PasMessage message) {
        log.info("************ Message Received ************");
        log.info("ID: " + message.getId());
        log.info("Name: " + message.getName());
    }
}
