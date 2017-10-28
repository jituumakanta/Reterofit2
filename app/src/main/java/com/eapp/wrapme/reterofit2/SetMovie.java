package com.eapp.wrapme.reterofit2;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

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
/*

    */
/**
     *Reterofit 2.0
     * @param movie_name
     * @param movie_link
     *
     *//*

    @FormUrlEncoded
    @POST("/movie/set_movie.php")
    Call<Response> insertData(@Field("movie_name") String movie_name, @Field("movie_link") String movie_link);



     //main url-http://bluedeserts.com/mynews/z_get_news_all.php?catagory=news_cricket&page=1

*/

 /*
*//**
     *Reterofit 2.0
     *
     *
     *//*
    @FormUrlEncoded
    @POST("/movie/set_movie.php")
    Call<Response> insertData(@Query("movie_name") String movie_name, @Field("movie_link") String movie_link);


*/




     //https://androidtutorialpoint.com/api/RetrofitAndroidObjectResponse
    @GET("/api/RetrofitAndroidObjectResponse")
    Call<Student> insertData();

    @GET("api/RetrofitAndroidArrayResponse")
    Call<Student1> insertData1();

    @GET("mynews/z_get_news_all.php?catagory=news_cricket&page=2")
    Call<List<Student2>> insertData2();

    @GET("mynews/z_get_news_all.php")
    Call<newsresponse> getTopRatedMovies(@Query("page") String apiKey,@Query("catagory") String catagory);



    @GET("/3/movie/top_rated?api_key=f8a29713551517de92be525a79762b6c")
    Call<movieresponse<movies>> getTopRatedMovies1() ;


}
