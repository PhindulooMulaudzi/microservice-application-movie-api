package net.mulaudzi.resource;

import org.springframework.data.repository.CrudRepository;

import net.mulaudzi.model.Movie;
import net.mulaudzi.model.MovieRatingId;

public interface MovieRatingsRepository extends CrudRepository<Movie, MovieRatingId>{

}
