package com.techgeeknext.implref;


import java.util.List;

import com.techgeeknext.entities.MovieData;
import com.techgeeknext.repo.MovieDataRepository;



public interface SearchService  {
	
	public List<MovieData> getSearch(MovieData request);

}
