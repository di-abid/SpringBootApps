package com.abid.moviecatalogservice.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.abid.moviecatalogservice.models.CatalogItem;
import com.abid.moviecatalogservice.models.Movie;
import com.abid.moviecatalogservice.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalogItems(@PathVariable("userId")String userId){
		UserRating ratings = restTemplate.getForObject("http://rating-data-service/rating/users/"+userId, UserRating.class);
		return ratings.getUserRatings().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movie/"+rating.getMovieId(), Movie.class);
			return new CatalogItem(rating.getRating(), movie.getMovieName(), "");
		})
		.collect(Collectors.toList());
	}
}
