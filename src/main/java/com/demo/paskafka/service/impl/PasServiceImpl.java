package com.demo.paskafka.service.impl;

import com.demo.paskafka.domain.dto.PasDTO;
import com.demo.paskafka.event.message.PasMessage;
import com.demo.paskafka.event.producer.PasProducer;
import com.demo.paskafka.service.PasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PasServiceImpl implements PasService {
    @Autowired
    private PasProducer pasProducer;

    @Value("app.topic.0")
    private String topic0;

    @Override
    public void send(PasDTO dto) {
        final PasMessage message = new PasMessage(UUID.randomUUID().toString(), dto.name());
        this.pasProducer.send(this.topic0, message);
    }
}
