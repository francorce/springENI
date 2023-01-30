package com.example.filmotheque.repository;

import com.example.filmotheque.entity.Film;
import com.example.filmotheque.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {


}
