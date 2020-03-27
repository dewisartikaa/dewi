package com.example.movie.network;

import android.graphics.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET(Constant.MOVIE_PATH + "/polular")
    Call<Movie> popularMovies (
            @Query("page") int page);

    @GET(Constant.MOVIE_PATH + "/{movie_id}/similar")
    Call<Movie> similarMovies (
            @Query("page")int page);
}
