package com.eapp.wrapme.reterofit2;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jitu on 10/21/2017.
 */

public class movieresponse<T> {


    @SerializedName("page")

    private Integer page;
    @SerializedName("total_results")

    private Integer totalResults;
    @SerializedName("total_pages")
    private Integer totalPages;

    @SerializedName("results")
    private List<movies> results = null;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<movies> getResults() {
        return results;
    }

    public void setResults(List<movies> results) {
        this.results = results;
    }
}
