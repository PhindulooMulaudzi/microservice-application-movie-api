package net.mulaudzi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

/*
 * In the context of this service, movie descriptions are not a thing
 * For this service a movie will have a userId (that is the user that rate it)
 * It will then also have a title and a rating.
 * In the context of this service a Movie that has a rating cannot exist without the user
 * that has assigned a rating for it
 * 
 * We learned that camelCase is really important for method variable name for Spring
 * It will fail to parse objects and return correctly if the methods are not in the 
 * conventional case
 * 
 * We learned about how to do the implementation for databases with composite keys.
 * Remember that the nature of this application is such that the database columns will not be unique
 * this create an issue where we can have a unique PK.
 */

@Entity(name = "MOVIE_RATINGS")
@IdClass(MovieRatingId.class)
public class Movie {
	@Id
	private String userid;
	@Id
	private String title;
	private Integer rating;

	public Movie() {

	}
	
	public Movie(String userId, String title, Integer rating) {
		this.userid = userId;
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

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getUserId() {
		return userid;
	}

	public void setUserId(String userId) {
		this.userid = userId;
	}
	
	
}
