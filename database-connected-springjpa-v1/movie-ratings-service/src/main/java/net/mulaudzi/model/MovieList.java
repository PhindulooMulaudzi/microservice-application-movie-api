package net.mulaudzi.model;

import java.util.ArrayList;
import java.util.List;

/*
 * We create this model for a MovieList, this is only useful for the purposes of returning
 * REST responses in the form of a list. Generally you want to avoid returning anything but 
 * Generic types. ('',)
 */

public class MovieList {
	private List<Movie> movieList;
	
	public MovieList() {
		this.movieList = new ArrayList<Movie>();
	}

	public MovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
}
