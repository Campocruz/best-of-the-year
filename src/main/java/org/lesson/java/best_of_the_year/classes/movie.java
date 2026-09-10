package org.lesson.java.best_of_the_year.classes;

public class movie {

  private int id;
  private String title;
  private String director;

  public movie() {
  }

  public movie(int id, String title, String director) {
    this.id = id;
    this.title = title;
    this.director = director;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDirector() {
    return this.director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  @Override
  public String toString() {
    return String.format("%s, %s", this.title, this.director);
  }

}
