package com.eapp.wrapme.reterofit2;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import com.eapp.wrapme.reterofit2.databinding.ActivityMainBinding;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Fullscreen;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//url-http://quliver.com/movie/set_movie.php
//method-post
//parameters-movie_name,movie_link
//@EActivity
//@Fullscreen
@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        movie();

    }


    public void movie() {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://androidtutorialpoint.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SetMovie service = retrofit.create(SetMovie.class);
        Call<Student> call = service.insertData();//here u can pass query
        call.enqueue(new Callback<Student>() {
            @Override
            public void onResponse(Call<Student> call, Response<Student> response) {
                System.out.println("ress" + response);
                System.out.println("kkkobject" + response.body().getStudentId() + response.body().getStudentName() + response.body().getStudentMarks());
            }

            @Override
            public void onFailure(Call<Student> call, Throwable t) {

            }


        });

        Retrofit retrofit1 = new Retrofit.Builder()
                .baseUrl("https://androidtutorialpoint.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SetMovie service1 = retrofit1.create(SetMovie.class);
        Call<Student1> call1 = service1.insertData1();
        call1.enqueue(new Callback<Student1>() {
            @Override
            public void onResponse(Call<Student1> call1, Response<Student1> response) {

                System.out.println("ress1" + response);
                Student1 StudentData = response.body();
                System.out.println("StudentData " + StudentData);

                /*for (int i = 0; i < StudentData.size(); i++) {

                    if (i == 0) {
                       // System.out.println("kkkarray1"+StudentData.get(i).getStudentId()+StudentData.get(i).getStudentName()+StudentData.get(i).getStudentMarks());

                    } else if (i == 1) {
                      //  System.out.println("kkkarray2"+StudentData.get(i).getStudentId()+StudentData.get(i).getStudentName()+StudentData.get(i).getStudentMarks());

                    }
                }*/

                // text_id_1.setText("StudentId  :  " + response.body().getStudentId());
                //text_name_1.setText("StudentName  :  " + response.body().getStudentName());
                // text_marks_1.setText("StudentMarks  : " + response.body().getStudentMarks());
            }

            @Override
            public void onFailure(Call<Student1> call1, Throwable t) {

            }


        });




        Retrofit retrofit5 = new Retrofit.Builder()
                .baseUrl("http://api.themoviedb.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SetMovie apiService5 = retrofit5.create(SetMovie.class);
        Call<movieresponse<movies>> call5 = apiService5.getTopRatedMovies1();
        call5.enqueue(new Callback<movieresponse<movies>>() {
            @Override
            public void onResponse(Call<movieresponse<movies>> call, Response<movieresponse<movies>> response) {
                int statusCode = response.code();
                List<movies> movies = response.body().getResults();
                for (int i = 0; i < movies.size(); i++) {
                    System.out.println("lll: " + movies.get(i).getGenreIds().get(0));
                }

            }

            @Override
            public void onFailure(Call<movieresponse<movies>> call, Throwable t) {
                // Log error here since request failed

            }
        });

    }


}
