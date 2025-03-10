package com.marcelo1.exemplo1.repository;

import com.marcelo1.exemplo1.model.Livestream;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Repository
public class LivestreamRepository {
    List<Livestream> streams = new ArrayList<>();

    public LivestreamRepository(){
        streams.add(new Livestream(
                UUID.randomUUID().toString(),
                "live do baiano",
                "descricao",
                "https://www.twitch.tv/baiano",
                LocalDateTime.of(2025,3,9,10,9),
                LocalDateTime.of(2025,3,9,11,9)

        ));
    }

    public List<Livestream> findAll(){
        return streams;
    }

    public Livestream findById(String id) {
        return streams.stream()
                .filter(stream -> stream.id().equals(id))
                .findFirst()
                .orElse(null); // Retorna null se não encontrar
    }

    public Livestream create (Livestream stream){
        streams.add(stream);
        return stream;
    }

    public void update(Livestream stream, String id){
        Livestream existente = streams.stream().filter(s -> s.id().equals(id)) //encontra o id da live
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Stream nao encontrada"));
        int i = streams.indexOf(existente); //acha a posição na lista
        streams.set(i, stream); //atualiza
    }

    public void delete(String id){
        streams.removeIf(stream -> stream.id().equals(id));
    }
}
