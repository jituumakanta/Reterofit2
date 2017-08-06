package com.eapp.wrapme.reterofit2;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by jitu on 8/6/2017.
 */

public interface SetMovie {
/*
    *//**
     * Reterofit 1.9
     * @param movie_name
     * @param movie_link
     * @param callback
     *//*
    @FormUrlEncoded
    @POST("/movie/set_movie.php")
    public void insertData(Callback<Response> callback,@Field("movie_name") String movie_name, @Field("movie_link") String movie_link);

    */

    /**
     *Reterofit 2.0
     * @param movie_name
     * @param movie_link
     *
     */
    @FormUrlEncoded
    @POST("/movie/set_movie.php")
    Call<Response> insertData(@Field("movie_name") String movie_name, @Field("movie_link") String movie_link);




}
