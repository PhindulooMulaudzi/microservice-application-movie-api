package net.mulaudzi.model;

/*
 * In the context of this service, ratings are not a thing
 * For this service a movie just has a description and thats it
 */

public class Movie {
	private String title;
	private String descirption;

	public Movie() {

	}
	
	public Movie(String title, String descirption) {
		this.title = title;
		this.descirption = descirption;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescirption() {
		return descirption;
	}

	public void setDescirption(String descirption) {
		this.descirption = descirption;
	}
	
}
