package net.mulaudzi.model;

/*
 * In the context of this service, movie descriptions are not a thing
 * For this service a movie just has a title and rating
 * 
 * We learned that camelCase is really important for method variable name for Spring
 * It will fail to parse objects and return correctly if the methods are not in the 
 * converntional case
 */

public class Movie {
	private String title;
	private Integer rating;

	public Movie() {

	}
	
	public Movie(String title, Integer rating) {
		this.title = title;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getRating() {
		return rating;
	}

	public void setDescirption(Integer rating) {
		this.rating = rating;
	}
	
}
