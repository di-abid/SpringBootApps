package com.abid.moviecatalogservice.models;

import java.util.List;

public class UserRating {
	private List<Rating> userRatings;

	/**
	 * @return the userRatings
	 */
	public List<Rating> getUserRatings() {
		return userRatings;
	}

	/**
	 * @param userRatings the userRatings to set
	 */
	public void setUserRatings(List<Rating> userRatings) {
		this.userRatings = userRatings;
	}
}
