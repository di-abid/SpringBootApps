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
		if("MOV1".equalsIgnoreCase(movieId)) {
			return new Movie("MOV1", "Transformers");
		}else if("MOV2".equalsIgnoreCase(movieId)) {
			return new Movie("MOV2", "Avengers");
		}else if("MOV3".equalsIgnoreCase(movieId)) {
			return new Movie("MOV3", "Trooy");
		}else if("MOV4".equalsIgnoreCase(movieId)) {
			return new Movie("MOV4", "SpiderMan");
		}
		return null;
	}
}
