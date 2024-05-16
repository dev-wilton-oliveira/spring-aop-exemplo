package com.example.demoaop;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
@RequiredArgsConstructor
public class EventoApi {

    private final EventoServico servico;

    @PostMapping
    public ResponseEntity<EventoRecord> salvarEvento(@RequestBody MensagemRecord mensagemDTO) {
        var evento = servico.salvar(mensagemDTO);
        return ResponseEntity.ok().body(evento);
    }

}
