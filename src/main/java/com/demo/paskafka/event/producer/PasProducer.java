package com.demo.paskafka.event.producer;

import com.demo.paskafka.event.message.PasMessage;
import lombok.AllArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PasProducer {
    private final StreamBridge streamBridge;

    public void send(String topic, PasMessage message) {
        this.streamBridge.send(topic, message);
    }
}
