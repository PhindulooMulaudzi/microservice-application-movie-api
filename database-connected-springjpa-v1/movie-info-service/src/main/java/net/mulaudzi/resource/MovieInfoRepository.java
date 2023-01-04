package net.mulaudzi.resource;

import org.springframework.data.repository.CrudRepository;

import net.mulaudzi.model.Movie;

/*
 * This interface is simply going to allow us to perform CRUD operations using spring JPA on our database
 * Notice how it extends CrudRepository and declares <database model, primary key datatype
 */

public interface MovieInfoRepository extends CrudRepository<Movie, String>{

}
