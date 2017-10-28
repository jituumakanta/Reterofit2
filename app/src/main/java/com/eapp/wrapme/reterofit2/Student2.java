package com.eapp.wrapme.reterofit2;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import retrofit2.Call;

/**
 * Created by jitu on 10/21/2017.
 */

public class Student2 {

    @SerializedName("articles")
    private List<Student2> results;

    public List<Student2> getResults() {
        return results;
    }

    public void setResults(List<Student2> results) {
        this.results = results;
    }


}
