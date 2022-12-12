package com.eliezergarbin.gameawards.controller.games;

import com.eliezergarbin.gameawards.controller.BaseRestController;
import com.eliezergarbin.gameawards.domain.model.Game;
import com.eliezergarbin.gameawards.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class GameRestController extends BaseRestController {

    @Autowired
    private GameService businessLayer;

    @GetMapping("games")
    public ResponseEntity<List<Game>> findAll() {
        List<Game> games = businessLayer.findAll();
        return ResponseEntity.ok(games);
    }

    @GetMapping("games/{id}")
    public ResponseEntity<Game> findById(@PathVariable Long id) {
        return ResponseEntity.ok(businessLayer.findById(id));
    }

    @PostMapping("games")
    public ResponseEntity<Game> insert(@RequestBody Game game) {
        businessLayer.insert(game);
        return ResponseEntity.status(HttpStatus.CREATED).body(game);
    }

    @PutMapping("games/{id}")
    public ResponseEntity<Game> update(@PathVariable Long id, @RequestBody Game game) {
        businessLayer.update(id, game);
        return ResponseEntity.ok(game);
    }

    @DeleteMapping("games/{id}")
    public ResponseEntity<Game> delete(@PathVariable Long id) {
        businessLayer.delete(id);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("games/{id}/vote")
    public ResponseEntity<Game> update(@PathVariable Long id) {
        businessLayer.vote(id);
        return ResponseEntity.ok().build();
    }

}
