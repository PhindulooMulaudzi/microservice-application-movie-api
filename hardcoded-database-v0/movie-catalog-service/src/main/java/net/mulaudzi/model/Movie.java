package net.mulaudzi.model;

public class Movie {
	private String title;
	private String descirption;
	private int rating;
	
	public Movie() {
		
	}

	public Movie(String title, String descirption, int rating) {
		this.title = title;
		this.descirption = descirption;
		this.rating = rating;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
