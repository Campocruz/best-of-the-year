package org.lesson.java.best_of_the_year.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.lesson.java.best_of_the_year.classes.movie;
import org.lesson.java.best_of_the_year.classes.song;

@Controller
@RequestMapping("/")
public class HomeController {

  @GetMapping("/")
  public String home() {
    return "homePage";
  }

  @GetMapping("/welcome")
  public String welcome(@RequestParam(name = "name") String name, Model model) {
    model.addAttribute("name", name);
    return "welcomePage";
  }

  @GetMapping("/movie")
  public String movie(Model model) {

    model.addAttribute("movieList", getBestMovie());

    return "moviePage";
  }

  @GetMapping("/movie/{id}")
  public String movieDetail(@PathVariable("id") String id, Model model) {

    int index = Integer.parseInt(id);
    ArrayList<movie> movieList = getBestMovie();
    model.addAttribute("movie", movieList.get(index));

    return "movieDetail";
  }

  @GetMapping("/song")
  public String song(Model model) {

    model.addAttribute("songList", getBestSong());

    return "songPage";
  }

  @GetMapping("/song/{id}")
  public String songDetail(@PathVariable("id") String id, Model model) {

    int index = Integer.parseInt(id);
    ArrayList<song> songList = getBestSong();
    model.addAttribute("song", songList.get(index));

    return "songDetail";
  }

  // BUISNESS LOGIC
  private ArrayList<movie> getBestMovie() {

    ArrayList<movie> bestMovie = new ArrayList<>();

    bestMovie.add(new movie(1, "Titanic", "Non lo so"));
    bestMovie.add(new movie(2, "Il Padrino", "Non lo so"));
    bestMovie.add(new movie(3, "Pulp Fiction", "Non lo so"));

    return bestMovie;
  }

  private ArrayList<song> getBestSong() {

    ArrayList<song> bestSong = new ArrayList<>();

    bestSong.add(new song(1, "Like a Rolling Stone", "Bob Dylan"));
    bestSong.add(new song(2, "Bohemian Rhapsody", "Queen"));
    bestSong.add(new song(3, "Smells Like Teen Spirit", "Nirvana"));

    return bestSong;
  }
}
