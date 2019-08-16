package com.abid.ratingsdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abid.ratingsdataservice.models.Rating;
import com.abid.ratingsdataservice.models.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingResource {
	/*Method for getting movie ratings*/
	@RequestMapping("/{movieId}")
	public Rating getMovieRating(@PathVariable("movieId")String movieId) {
		return new Rating("MOV1", 4);
	}
	
	@GetMapping("/users/{userId}")
	public UserRating getUserMovieRating(@PathVariable("userId") String userId) {
		System.out.println("Getting rating for userId = " + userId);
		List<Rating> ratings = Arrays.asList(
				new Rating("MOV1", 4),
				new Rating("MOV2", 3),
				new Rating("MOV3", 2.5),
				new Rating("MOV4", 5)
				);
		
		UserRating ua = new UserRating();
		ua.setUserRatings(ratings);
		return ua;
	}
}
