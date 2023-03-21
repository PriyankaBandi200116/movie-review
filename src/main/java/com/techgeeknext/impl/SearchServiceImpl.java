package com.techgeeknext.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techgeeknext.entities.MovieData;
import com.techgeeknext.implref.SearchService;
import com.techgeeknext.repo.MovieDataRepository;


@Service
public class SearchServiceImpl implements SearchService {
	
	@Autowired
	MovieDataRepository repo;

	@Override
	public List<MovieData> getSearch(MovieData req) {
		// TODO Auto-generated method stub
		List<MovieData> sResponseList  =  new ArrayList<MovieData>();
				sResponseList=repo.findAll();
				System.out.println("sResponseList"+sResponseList);

		List<MovieData> finalList = new ArrayList<>();
		
	   if(sResponseList !=null && sResponseList.size()>0) {
		sResponseList.stream().forEach(movieData -> {
		  if((movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  /*&& (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))*/)
			  
			  
			  
		  { 
			  finalList.add(movieData);	  
		  }
		});
		}
	   
		return finalList;
	}
	
	
	
}