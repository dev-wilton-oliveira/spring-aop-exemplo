package com.example.demoaop.exemplo1;

import java.time.LocalDateTime;
import java.util.UUID;

public record EventoRecord(
        UUID id,
        LocalDateTime dataHoraEvento,
        String mensagem) {
}
