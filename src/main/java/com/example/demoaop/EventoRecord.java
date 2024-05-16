package com.example.demoaop;

import java.time.LocalDateTime;
import java.util.UUID;

public record EventoRecord(
        UUID id,
        LocalDateTime dataHoraEvento,
        String mensagem) {
}
