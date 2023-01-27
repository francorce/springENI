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

		this.films = films;

	}



}
