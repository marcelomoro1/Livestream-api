package com.marcelo1.exemplo1.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Mutavel_Livestream {
    private String id;
    private String titulo;
    private String descricao;
    private String url;
    private LocalDateTime data_inicio;
    private LocalDateTime data_fim;

    public Mutavel_Livestream() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDateTime data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDateTime getData_fim() {
        return data_fim;
    }

    public void setData_fim(LocalDateTime data_fim) {
        this.data_fim = data_fim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mutavel_Livestream that = (Mutavel_Livestream) o;
        return id.equals(that.id) && titulo.equals(that.titulo) && descricao.equals(that.descricao) && url.equals(that.url) && data_inicio.equals(that.data_inicio) && data_fim.equals(that.data_fim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, descricao, url, data_inicio, data_fim);
    }

    @Override
    public String toString() {
        return "Livestream{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", url='" + url + '\'' +
                ", data_inicio=" + data_inicio +
                ", data_fim=" + data_fim +
                '}';
    }
}
