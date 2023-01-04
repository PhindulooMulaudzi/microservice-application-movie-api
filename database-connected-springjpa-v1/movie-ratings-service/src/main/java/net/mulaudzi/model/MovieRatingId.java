package net.mulaudzi.model;

import java.io.Serializable;
import java.util.Objects;

/*
 * This class models the composite key that we will use to access our ratings database
 * 
 * Below are the conditions for creating a composite key:
 * 
 * The composite primary key class must be public, contains a no-argument constructor, 
 * defines both equals() and hashCode() methods, and implements the Serializable interface.
 * 
 * https://attacomsian.com/blog/spring-data-jpa-composite-primary-key
 */

public class MovieRatingId implements Serializable{
	private String userid;
	private String title;
	
	public MovieRatingId() {
		
	}
	
	public MovieRatingId(String userid, String title) {
		this.userid = userid;
		this.title = title;
	}
	
	@Override
    public boolean equals(Object o) {
        /*
         * Override to just compare object to class local variables
         */
		
		if (this == o) return true;
        
        if (o == null || getClass() != o.getClass()) return false;
        
        MovieRatingId movieRatingId = (MovieRatingId) o;
                
        return userid.equals(movieRatingId.userid) &&
                title.equals(movieRatingId.title);
    }
	
    @Override
    public int hashCode() {
        return Objects.hash(userid, title);
    }
}
