package com.example.filmotheque.bll;

import com.example.filmotheque.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmService {

    List<Film> findAll();

    Film addFilm(Film film);


}
