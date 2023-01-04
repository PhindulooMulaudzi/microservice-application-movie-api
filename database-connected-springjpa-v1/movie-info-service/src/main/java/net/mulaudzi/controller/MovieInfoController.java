package net.mulaudzi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.mulaudzi.model.Movie;
import net.mulaudzi.service.MovieInfoService;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
	@Autowired
	MovieInfoService movieInfoService;
	
	@RequestMapping("/{title}")
	public Movie getMovieInfo(@PathVariable String title) {
		return movieInfoService.getMovieInfo(title);
	}
}
