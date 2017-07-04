package com.example.dongkibae.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

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


    // GET/POST/DELETE/PUT 메소드들을 인터페이스에 구현하여 사용할 수 있다.
    @GET("/repos/{owner}/{repo}/contributors")
    // JSON Array를 리턴하므로 List<>가 되었다
    Call<List<Contributor>> contributors(
            // param 값으로 들어가는 것들이다
            @Path("owner") String owner,
            @Path("repo") String repo);




}
