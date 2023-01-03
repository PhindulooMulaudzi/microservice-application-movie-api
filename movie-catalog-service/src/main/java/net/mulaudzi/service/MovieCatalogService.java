package net.mulaudzi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.xml.catalog.Catalog;

import org.springframework.stereotype.Service;

import net.mulaudzi.model.Movie;

/*
 * This is our catalog service, it keeps a list of all our registered users and they movies they have watched.
 * The rating and movie description are from another microservice and are init to nulls
 */

@Service
public class MovieCatalogService {
	//(userId, List<Movies>)
    private HashMap<String, List<Movie>> catalog;
    
	public MovieCatalogService() {
		this.catalog = new HashMap<String, List<Movie>>();
		this.catalog.put("Phindulo", Arrays.asList(new Movie("Transformers", null, 0), new Movie("Titanic", null, 0)));
		this.catalog.put("Nathan", Arrays.asList(new Movie("Superman", null, 0), new Movie("Batman", null, 0)));
	}
	
	/*
	 * This method receives the movie description and rating from our RestTemplate
	 * We then update the description on our local movies list before we send it back to the controller for posting
	 */
	public List<Movie> getCatalog(String userId) {
		ArrayList<Movie> movies = new ArrayList<Movie>(catalog.get(userId));
		ArrayList<Movie> moviesList = new ArrayList<Movie>();

		for(int idx = 0; idx < movies.size(); idx++) {
			Movie catalogEntry = movies.get(idx);
			catalogEntry.setDescirption(null);
			catalogEntry.setRating(-1);
			moviesList.add(catalogEntry);
		}
		return moviesList;
	}

}
