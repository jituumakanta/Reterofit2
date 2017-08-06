package com.eapp.wrapme.reterofit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//url-http://quliver.com/movie/set_movie.php
//method-post
//parameters-movie_name,movie_link

public class MainActivity extends AppCompatActivity {

    public static final String ROOT_URL = "http://quliver.com/";
    SetMovie SetMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetMovie = APIClient.getClient().create(SetMovie.class);
        movie();
    }



    public void movie(){
        Call c=SetMovie.insertData("aaa","bbb");
        c.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                Toast.makeText(getApplicationContext(), "k", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onFailure(Call call, Throwable t) {
                call.cancel();
            }
        });

    }






}
