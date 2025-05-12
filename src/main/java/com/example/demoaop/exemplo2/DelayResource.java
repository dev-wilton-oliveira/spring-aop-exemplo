package com.example.demoaop.exemplo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
@RequestMapping("delay")
public class DelayResource {

    @GetMapping
    @Timed
    public String delay() throws InterruptedException {
        int tempo = 5;
        Thread.sleep(Duration.ofSeconds(tempo).toMillis());
        return "Executado após %s segundos".formatted(tempo);
    }

}
