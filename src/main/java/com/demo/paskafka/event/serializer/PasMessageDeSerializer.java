package com.demo.paskafka.event.serializer;

import com.demo.paskafka.event.message.PasMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.kafka.support.serializer.DeserializationException;

import java.io.IOException;

public class PasMessageDeSerializer implements Deserializer<PasMessage> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public PasMessage deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(new String(data), PasMessage.class);
        } catch (IOException e) {
            throw new DeserializationException(e.getMessage(), data, false, e);
        }
    }
}
