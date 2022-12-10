package com.eliezergarbin.gameawards.service.impl;

import com.eliezergarbin.gameawards.domain.model.Game;
import com.eliezergarbin.gameawards.domain.model.GameRepository;
import com.eliezergarbin.gameawards.service.GameService;
import com.eliezergarbin.gameawards.service.exception.BusinessException;
import com.eliezergarbin.gameawards.service.exception.NoContentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class GameServiceImpl  implements GameService {

    @Autowired
    private GameRepository repository;

    @Override
    public List<Game> findAll() {
        return repository.findAll();
    }

    @Override
    public Game findById(Long id) {
        Optional<Game> game = repository.findById(id);
        return game.orElseThrow(NoContentException::new);
    }

    @Override
    public void insert(Game game) {
        if(Objects.nonNull(game.getId())) {
            throw new BusinessException("O ID é diferente de NULL na inclusão.");
        }
        repository.save(game);
    }

    @Override
    public void update(Long id, Game game) {
        Game gameDb = findById(id);
        if(gameDb.getId().equals(game.getId())) {
            repository.save(game);
        } else {
            throw new BusinessException("Os IDs para alteração são divergentes.");
        }
    }

    @Override
    public void delete(Long id) {
        Game gameDb = findById(id);
        repository.delete(gameDb);
    }
}
