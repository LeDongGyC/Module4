package com.codegym.service;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();

    void create(Music music);

    Music findById(int id);

    void remove(Music music);

    void update(int id, Music music);
}
