package com.demo.paskafka.service.impl;

import com.demo.paskafka.domain.dto.PasDTO;
import com.demo.paskafka.event.producer.PasProducer;
import com.demo.paskafka.service.PasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasServiceImpl implements PasService {
    @Autowired
    private PasProducer producer;

    @Override
    public void send(PasDTO dto) {
        this.producer.produce(dto.name());
    }
}
