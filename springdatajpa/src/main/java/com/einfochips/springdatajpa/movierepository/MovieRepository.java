package com.einfochips.springdatajpa.movierepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.einfochips.springdatajpa.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	List<Movie> findByMlanguage(String mlanguage);
	List<Movie> findByMdirector(String mdirector);
	List<Movie> findByMdirectorAndMlanguage(String mdirector,String mlanguage);
//	@Query("select m from Movie m where m.mlanguage=: lang")
//	List<Movie> findMovieBylanguage(@Param("lang") String lang);

}
