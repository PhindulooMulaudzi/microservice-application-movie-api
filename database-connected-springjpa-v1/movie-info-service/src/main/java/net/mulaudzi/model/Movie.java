package net.mulaudzi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * In the context of this service, ratings are not a thing
 * For this service a movie just has a description and thats it
 */

/*
 * We leverage the power of Spring JPA, our Movie model class now represents the Table in the databse
 * that we will be getting our information from. Note the @Entity annotation indicate the class is 
 * a Spring JPA database model class and represent the table. The @Id annotation indicates the primary key
 * of the database Table we will be using.
 * 
 * In order to leverage this we also need to inherit the Spring CRUD repository to perform CRUD operations
 * We have implemented this under the resource package
 */

@Entity(name = "MOVIE_INFO")
public class Movie {
	@Id
	private String title;
	private String description;

	public Movie() {

	}
	
	public Movie(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescirption() {
		return description;
	}

	public void setDescirption(String descirption) {
		this.description = descirption;
	}
	
}
