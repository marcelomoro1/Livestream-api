package com.marcelo1.exemplo1.controller;

import com.marcelo1.exemplo1.model.Livestream;
import com.marcelo1.exemplo1.repository.LivestreamRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/streams")
public class LivestreamController {

    private final LivestreamRepository repository;

    public LivestreamController(LivestreamRepository repository) {
        this.repository = repository; //quando criado o controller recebe um repository para controlar o banco de dados
    }


    //http://localhost:8080/streams
    @GetMapping()
    public List<Livestream> findAll(){
        return repository.findAll();
    }

    //http://localhost:8080/streams/{id}
    @GetMapping("/{id}")
    public Livestream findById(@PathVariable String id){ //path segue a estrutura restful e preenche automaticamente o id com o valor na url
        return repository.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED) //201 = criado com sucesso
    @PostMapping("/add")
    public Livestream add(@RequestBody Livestream stream){ //Request transforma JSON num objeto
        return repository.create(stream);
    }

    //http://localhost:8080/streams/{id}
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Livestream stream, @PathVariable String id){
        repository.update(stream,id);
    }

    //http://localhost:8080/streams/{id}
    @ResponseStatus(HttpStatus.NO_CONTENT) //foi bem sucedida e não há nada para retornar
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        repository.delete(id);
    }
}
