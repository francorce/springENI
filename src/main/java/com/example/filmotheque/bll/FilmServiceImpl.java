package com.example.filmotheque.bll;

import com.example.filmotheque.entity.Film;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
@Service
public class FilmServiceImpl implements FilmService {

	List<Film> films = new ArrayList<>();

	public List<Film> findAll() {
		return films;
	}

	public FilmServiceImpl(List<Film> films) {
		this.films = generateRandomFilms();
	}

	public List<Film> generateRandomFilms(){

		String[] titles = {"Film 1", "Film 2", "Film 3"};
		String[] directors = {"Director 1", "Director 2", "Director 3"};
		int[] years = {2000, 2010, 2020};

		for (int i = 0; i < 10; i++) {
			String title = titles[(int)(Math.random() * titles.length)];
			String director = directors[(int)(Math.random() * directors.length)];
			int year = years[(int)(Math.random() * years.length)];
			Film film = new Film(title,director,year);
			films.add(film);

		}
		return films;
	}



}
