package com.demo.paskafka.controller;

import com.demo.paskafka.domain.dto.PasDTO;
import com.demo.paskafka.service.PasService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pas")
@AllArgsConstructor
public class PasController {
    private final PasService pasService;

    @PostMapping("/topic0")
    public void send(@RequestBody PasDTO dto) {
        this.pasService.send(dto);
    }
}
