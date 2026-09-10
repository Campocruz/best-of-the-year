package org.lesson.java.best_of_the_year.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
  public String movie() {

    return "moviePage";
  }

  @GetMapping("/song")
  public String song() {

    return "songPage";
  }

  // BUISNESS LOGIC
  private String getBestMovie() {

    return "moviePage";
  }

  private String getBestSong() {

    return "songPage";
  }
}
