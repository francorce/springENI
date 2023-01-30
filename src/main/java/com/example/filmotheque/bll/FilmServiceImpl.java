package com.example.filmotheque.bll;

import com.example.filmotheque.entity.Film;
import com.example.filmotheque.entity.Genre;
import com.example.filmotheque.repository.FilmRepository;
import com.example.filmotheque.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service("filmService")
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmRepository filmRepository;

    @Autowired
    private GenreRepository genreRepository;

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


    public List<Genre> findAllGenres() {
        return genreRepository.findAll();
    }

}
