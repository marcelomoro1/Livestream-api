package com.marcelo1.exemplo1.model;

import java.time.LocalDateTime;

public record Livestream(String id,
                         String title,
                         String description,
                         String url,
                         LocalDateTime data_inicio,
                         LocalDateTime data_fim) {

}
