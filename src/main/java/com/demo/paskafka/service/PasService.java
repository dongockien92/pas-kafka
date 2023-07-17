package com.demo.paskafka.service;

import com.demo.paskafka.domain.dto.PasDTO;

public interface PasService {
    void send(PasDTO dto);
}
