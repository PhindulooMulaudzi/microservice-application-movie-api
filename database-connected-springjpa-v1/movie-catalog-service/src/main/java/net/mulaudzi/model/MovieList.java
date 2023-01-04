package net.mulaudzi.model;

import java.util.ArrayList;
import java.util.List;

/*
 * We create this model for a MovieList, this is only useful for the purposes of returning
 * REST responses in the form of a list. Generally you want to avoid returning anything but 
 * Generic types. ('',)
 * 
 * We also noticed that in order for the Rest Protocol to get the object return from the other service
 * The model needs to be defined the same way (Name, Variable Names e.t.c)
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
