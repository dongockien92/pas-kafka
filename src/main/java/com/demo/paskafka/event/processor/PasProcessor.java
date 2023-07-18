package com.demo.paskafka.event.processor;

import com.demo.paskafka.event.message.PasMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
@Slf4j
public class PasProcessor implements Function<PasMessage, PasMessage> {

    @Override
    public PasMessage apply(PasMessage input) {
        log.info("************ Message Processing ************");
        log.info("ID: " + input.getId());
        log.info("Name: " + input.getName());
        return new PasMessage(input.getId(), input.getName().concat("-processed"));
    }
}
