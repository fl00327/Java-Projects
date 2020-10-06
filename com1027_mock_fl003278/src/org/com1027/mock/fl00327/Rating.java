package org.com1027.mock.fl00327;

public class Rating {
private String organisation = null;
private int numberOfStars = 0;

public Rating(String organisation, int numberOfStars)throws IllegalArgumentException {
	super();
	if(organisation.matches("[A-Z][a-z]+")) {
	this.organisation = organisation;
	}else {
		throw new IllegalArgumentException("Your Name Does Not matches the criteria");
	}
	if(numberOfStars > 0 && numberOfStars < 6) {
	this.numberOfStars = numberOfStars;
	}else {
		throw new IllegalArgumentException("Rating can be only between 1 to 5");
	}
}

public String getOrganisation() {
	return this.organisation;
}

public int getNumberOfStars() {
	return this.numberOfStars;
}


}
