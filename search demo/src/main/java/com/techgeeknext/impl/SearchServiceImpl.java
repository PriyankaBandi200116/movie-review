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
				  /*|| (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))*/
				  //0
				  
				  /*&&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //1
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //2
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //3
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //4
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //5
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  &&(movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //6
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //7
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //8
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //9
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //10
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //11
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //12
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //13
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //14
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //15
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //16
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //17
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //18
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //19
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //20
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //21
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //22
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //23
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //24
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //25
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  ||(movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //26
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //27
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //28
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //29
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //30
				  
				  ||(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  || (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  || (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  || (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  || (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))
				  //31
				  
				  &&(movieData.getMoviename() != null  && movieData.getMoviename().equalsIgnoreCase(req.getMoviename()))
				  && (movieData.getLang() !=null && movieData.getLang().equalsIgnoreCase(req.getLang()))
				  && (movieData.getDirector() !=null && movieData.getDirector().equalsIgnoreCase(req.getDirector()))
				  && (movieData.getGenere() !=null && movieData.getGenere().equalsIgnoreCase(req.getGenere()))
				  && (movieData.getReleasedate() !=null && movieData.getReleasedate().equalsIgnoreCase(req.getReleasedate()))*/
				  )
			  
			  
			  
		  { 
			  finalList.add(movieData);	  
		  }
		});
		}
	   
		return finalList;
	}
	
	
	
}