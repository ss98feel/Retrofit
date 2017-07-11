package com.example.dongkibae.retrofit;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by dongkibae on 2017. 6. 27..
 */

public interface GitHubService {
//    @GET("repos/{owner}/{repo}/contributors")
//    Call<List<Contributor>> repoContributors(
//            @Path("owner") String owner,
//            @Path("repo") String repo);
//
//    public static final Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl("https://api.github.com/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build();


    /*
      Retrofit get annotation with our URL
      And our method that will return us the List of ContactList
      */
    @GET("/json_data.json")
    Call<Contributor> getMyJSON();




}
