package com.marcelo1.exemplo1.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Imutavel_Livestream {
    private final String id;
    private final String titulo;
    private final String descricao;
    private final String url;
    private final LocalDateTime data_inicio;
    private final LocalDateTime data_fim;


    public Imutavel_Livestream(String id, String titulo, String descricao, String url, LocalDateTime data_inicio, LocalDateTime data_fim) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.url = url;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getData_inicio() {
        return data_inicio;
    }

    public LocalDateTime getData_fim() {
        return data_fim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imutavel_Livestream that = (Imutavel_Livestream) o;
        return id.equals(that.id) && titulo.equals(that.titulo) && descricao.equals(that.descricao) && url.equals(that.url) && data_inicio.equals(that.data_inicio) && data_fim.equals(that.data_fim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, descricao, url, data_inicio, data_fim);
    }

    @Override
    public String toString() {
        return "FinalLivestream{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", url='" + url + '\'' +
                ", data_inicio=" + data_inicio +
                ", data_fim=" + data_fim +
                '}';
    }


}
