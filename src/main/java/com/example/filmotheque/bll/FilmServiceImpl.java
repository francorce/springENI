package com.example.filmotheque.bll;

import com.example.filmotheque.entity.Film;
import com.example.filmotheque.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
            private FilmRepository filmRepository;

    List<Film> films = new ArrayList<>();

    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    public Film addFilm(Film film) {
filmRepository.save(film);
        return film;
    }

    public FilmServiceImpl(List<Film> films) {

        this.films = films;

    }


}
