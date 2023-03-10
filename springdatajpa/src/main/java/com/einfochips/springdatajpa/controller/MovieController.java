package com.einfochips.springdatajpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.einfochips.springdatajpa.model.Movie;
import com.einfochips.springdatajpa.movierepository.MovieRepository;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class MovieController {
	
	@Autowired
	private MovieRepository movieRepo;
	
	@RequestMapping("home")
	public ModelAndView getHomePage() {
		return new ModelAndView("home");
	}
	@RequestMapping("addmovie")
	public ModelAndView getaddmoviepage(){
		return new ModelAndView("addmovie");
	}
	@RequestMapping("deletemovie")
	public ModelAndView deleteMoviePage()
	{
		ModelAndView mv1=new ModelAndView("deletemovie");
		List<Movie> li=movieRepo.findAll();
		mv1.addObject("movie", li);
		return mv1;
	}
	@RequestMapping("deleteMovie")
	public ModelAndView deleteMovie(@RequestParam int mid) {
		ModelAndView mv=new ModelAndView("ViewMovie");
		movieRepo.deleteById(mid);
		List<Movie> li = movieRepo.findAll();
		mv.addObject("movie", li);
		return mv;
	}
	
	
	@RequestMapping("insertmovie")
	public ModelAndView insertmovie(@RequestParam String mname,@RequestParam String mdirector,@RequestParam String mlanguage,@ModelAttribute Movie movie)
	{
		ModelAndView mv=new ModelAndView("ViewMovie");
		//int movieid=Integer.parseInt(req.getParameter("mid"));
		movieRepo.save(movie);
		List<Movie> li = movieRepo.findAll();
//		Movie m=new Movie(mid,mname,mdirector,mlanguage);
//		movieRepo.save(m);
		//System.out.println(m);
		//mv.addObject("mid", mid);
		mv.addObject("movie", li);
		mv.addObject("mname", mname);
		mv.addObject("mdirector", mdirector);
		mv.addObject("mlanguage", mlanguage);
		return mv;
	}

	@RequestMapping("viewmovie")
	public ModelAndView viewMovie()
	{
		ModelAndView mv1=new ModelAndView("ViewMovie");
		List<Movie> li=movieRepo.findAll();
//		for(int i=0;i<li.size();i++)
//		{
//			System.out.println(li.get(i));
//			//mv1.addObject("movie",li.get(i));
//		}
		mv1.addObject("movie", li);
		
		return mv1;
	}
	@RequestMapping("viewbylanguage")
	public ModelAndView getMovieByLanguage() {
		return new ModelAndView("viewbylanguage");
	}
	@RequestMapping("viewByLanguage")
	public ModelAndView getMovieOnLanguage(@RequestParam String mlanguage) {
		ModelAndView mv=new ModelAndView("ViewMovie");
		List<Movie> m=movieRepo.findByMlanguage(mlanguage);
		mv.addObject("movielanguage", m);
		return mv;
	}
	@RequestMapping("viewbydirector")
		public ModelAndView getdirectors() {
			return new ModelAndView("viewbydirector");
	}
	@RequestMapping("viewDirectors")
		public ModelAndView getviewbydirector(@RequestParam String mdirector){
			ModelAndView mav=new ModelAndView("ViewMovie");
			List<Movie> lis=movieRepo.findByMdirector(mdirector);
			mav.addObject("moviesdirector",lis);
			return mav;
		}
	@RequestMapping("languageAndDirector")
	public ModelAndView getbyDirAndLan()
	{
		return new ModelAndView("LanAndDir");
	}
	
	@RequestMapping("LanguageAndDirector")
	public ModelAndView getDirAndLan(@RequestParam String mdirector,@RequestParam String mlanguage)
	{
	   ModelAndView mav1=new ModelAndView("ViewMovie");
	   List<Movie> list=movieRepo.findByMdirectorAndMlanguage(mdirector, mlanguage);
	   mav1.addObject("languageDirector", list);
	   return mav1;
	}
	
	@RequestMapping("editMovie")
	public ModelAndView editmovie(@RequestParam int mid) {
		ModelAndView mav1=new ModelAndView("editmovie");
		  Movie m =movieRepo.getById(mid);
		   mav1.addObject("movie", m);
		   return mav1;
	}
	
//	@RequestMapping("LangHindi")
//	public ModelAndView getHindiMovies()
//	{
//		
//	}
}
