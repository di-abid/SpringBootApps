package com.abid.ratingsdataservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abid.ratingsdataservice.models.Rating;

@RestController
@RequestMapping("/rating")
public class RatingResource {
	@RequestMapping("/{movieId}")
	public Rating getMovieRating(@PathVariable("movieId")String movieId) {
		return new Rating("MOV1", 4);
	}
}
