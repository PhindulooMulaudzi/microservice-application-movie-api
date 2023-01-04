package net.mulaudzi.model;

public class Rating {
	private String title;
	private int rating;
	
	public Rating() {
		
	}

	public Rating(String title, int rating) {
		this.title = title;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}	
}
