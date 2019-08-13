package com.abid.movieinfoservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abid.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movie")
public class MovieInfoResource {
	
	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId")String movieId) {
		return new Movie("MOV1", "Transformers");
	}
}
