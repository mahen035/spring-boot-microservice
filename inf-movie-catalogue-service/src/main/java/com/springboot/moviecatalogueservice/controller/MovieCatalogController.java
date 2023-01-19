package com.springboot.moviecatalogueservice.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.moviecatalogueservice.model.CatalogItem;
import com.springboot.moviecatalogueservice.model.Movie;
import com.springboot.moviecatalogueservice.model.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
		//return Collections.singletonList(new CatalogItem("RRR", "Award winning", 5));
		
		List<Rating> ratings = Arrays.asList(new Rating("M123", 3), new Rating("M567", 5));
		
		return ratings.stream().map(rating -> {Movie movie=
				restTemplate.getForObject("http://movie-info-service/movie/5", Movie.class);
		        return new CatalogItem(movie.getName(), "TestDesc", rating.getRating());
		}).collect(Collectors.toList());
	}

}
