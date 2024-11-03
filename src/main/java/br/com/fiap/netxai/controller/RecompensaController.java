package br.com.fiap.netxai.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.netxai.model.Recompensa;
import br.com.fiap.netxai.repository.RecompensaRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "https://witty-desert-0abd3be0f.5.azurestaticapps.net")
@RestController
@RequestMapping("recompensas")
@Slf4j
@Tag(name = "Recompensa", description = "Endpoint de recompensas")
public class RecompensaController {

    @Autowired
    RecompensaRepository recompensaRepository;

    @GetMapping
    public List<Recompensa> index(){
        return recompensaRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public ResponseEntity<Recompensa> create(@RequestBody Recompensa recompensa){
        log.info("Cadastrando recompensa: {}", recompensa);
        Recompensa savedRecompensa = recompensaRepository.save(recompensa);
        return ResponseEntity.status(CREATED).body(savedRecompensa);
    }

    @GetMapping("{id}")
    public ResponseEntity<Recompensa> get(@PathVariable Long id){
        log.info("Buscando recompensa por id: {}", id);
        return recompensaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("{id}")
    public ResponseEntity<Recompensa> update(@PathVariable Long id, @RequestBody Recompensa recompensa){
        log.info("Atualizando recompensa id {} para {}", id, recompensa);
        verificarSeExisteRecompensa(id);
        recompensa.setIdRecompensa(id);
        Recompensa updatedRecompensa = recompensaRepository.save(recompensa);
        return ResponseEntity.ok(updatedRecompensa);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void destroy(@PathVariable Long id) {
        log.info("Apagando recompensa {}", id);
        verificarSeExisteRecompensa(id);
        recompensaRepository.deleteById(id);
    }

    private void verificarSeExisteRecompensa(Long id) {
        recompensaRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Recompensa não encontrada"));
    }
}
