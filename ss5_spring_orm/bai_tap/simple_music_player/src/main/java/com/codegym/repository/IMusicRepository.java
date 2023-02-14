package com.codegym.repository;

import com.codegym.model.Music;

import java.util.List;

public interface IMusicRepository {
    List<Music> findAll();

    void create(Music music);

    Music findById(int id);

    void remove(Music music);

    void update(int id, Music music);
}
