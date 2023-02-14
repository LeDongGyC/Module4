package com.codegym.repository;

import com.codegym.model.Music;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MusicRepository implements IMusicRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Music> findAll() {
        List<Music> musicList = new ArrayList<>();
        TypedQuery<Music> query = entityManager.createQuery("select m from Music as m", Music.class);
        musicList = query.getResultList();
        return musicList;

    }

    @Transactional
    @Override
    public void create(Music music) {
        entityManager.persist(music);
    }

    @Transactional
    @Override
    public Music findById(int id) {
        return entityManager.find(Music.class, id);
    }

    @Transactional
    @Override
    public void remove(Music music) {
        Music musicDelete = findById(music.getId());
        entityManager.remove(musicDelete);
    }

    @Transactional
    @Override
    public void update(int id, Music music) {
        Music musicUpdate = findById(music.getId());
        musicUpdate.setName(music.getName());
        musicUpdate.setSinger(music.getSinger());
        musicUpdate.setTypeOfSong(music.getTypeOfSong());
        musicUpdate.setUrl(music.getUrl());
        entityManager.merge(musicUpdate);
    }
}
