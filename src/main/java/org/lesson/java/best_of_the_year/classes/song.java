package org.lesson.java.best_of_the_year.classes;

public class song {

  private int id;
  private String title;
  private String artist;

  public song() {
  }

  public song(int id, String title, String artist) {
    this.id = id;
    this.title = title;
    this.artist = artist;
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

  public String getArtist() {
    return this.artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  @Override
  public String toString() {
    return String.format("%s, %s", this.title, this.artist);
  }

}
