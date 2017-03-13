package com.codeclan.moviesranking;

/**
 * Created by Adam Baxter on 13/03/2017.
 */

public class Movie {

    private int ranking;
    private String title;
    private String genre;


    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
