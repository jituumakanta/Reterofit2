package com.eapp.wrapme.reterofit2;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jitu on 8/6/2017.
 */

public class Response {
    @SerializedName("movie_name")
    String movie_name;
    @SerializedName("movie_link")
    String movie_link;

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_link() {
        return movie_link;
    }

    public void setMovie_link(String movie_link) {
        this.movie_link = movie_link;
    }

    Response(String movie_name, String movie_link){
        this.movie_name=movie_name;
        this.movie_link=movie_link;
    }
}
