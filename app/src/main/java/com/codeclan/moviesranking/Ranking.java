package com.codeclan.moviesranking;

/**
 * Created by Adam Baxter on 13/03/2017.
 */

public class Ranking {
    public Movie[] rankings;

    public Ranking(){
        this.rankings = rankings;
    }

    public void addMovie(Movie movie){
        this.rankings[9] = movie;
    }

    public Movie getMovie(int rank){
        int index = rank -1;
        return rankings[rank];
    }
}
