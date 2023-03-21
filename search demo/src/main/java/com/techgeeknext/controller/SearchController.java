package com.techgeeknext.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techgeeknext.entities.MovieData;
import com.techgeeknext.implref.SearchService;



@RestController
@RequestMapping("/search")
public class SearchController {

	@Autowired
	SearchService service;
	
	@PostMapping("/data")
	public  List<MovieData> getAllMovies(@RequestBody MovieData req){
		return service.getSearch(req);
	}

}
