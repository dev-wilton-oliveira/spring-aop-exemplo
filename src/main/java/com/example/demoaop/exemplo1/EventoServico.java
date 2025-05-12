package com.example.demoaop.exemplo1;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@Log4j2
public class EventoServico {

    public EventoRecord salvar(MensagemRecord mensagemDTO) {
        validarMensagem(mensagemDTO);
        var evento = new EventoRecord(UUID.randomUUID(), LocalDateTime.now(), mensagemDTO.mensagem());
        log.info(evento);
        return evento;
    }

    private void validarMensagem(MensagemRecord mensagemDTO) {
        if (mensagemDTO == null || mensagemDTO.mensagem() == null || mensagemDTO.mensagem().isBlank()) {
            throw new IllegalStateException("Mensagem não pode estar em branco...");
        }
    }

}
