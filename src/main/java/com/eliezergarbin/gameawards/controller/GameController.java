package com.eliezergarbin.gameawards.controller;

import com.eliezergarbin.gameawards.controller.games.BaseRestController;
import com.eliezergarbin.gameawards.domain.model.Game;
import com.eliezergarbin.gameawards.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController extends BaseRestController {

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
        return ResponseEntity.ok(game);

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

}
