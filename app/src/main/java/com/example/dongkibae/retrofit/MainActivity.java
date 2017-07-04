package com.example.dongkibae.retrofit;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private Retrofit retrofit;
    private TextView textView;


    private final String BASE_URL = "https://api.github.com";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
// GitHub API 인터페이스 생성
        GitHubService gitHub = retrofit.create(GitHubService.class);
        // 인터페이스에 구현한 메소드인 contributors에 param 값을 넘기는 요청 만ㄷ름
        Call<List<Contributor>> call = gitHub.contributors("square", "retrofit");

        // 앞서만든 요청을 수행
        call.enqueue(new Callback<List<Contributor>>() {
            @Override
            // 성공시
            public void onResponse(Call<List<Contributor>> call, Response<List<Contributor>> response) {
                List<Contributor> contributors = response.body();
                // 받아온 리스트를 순회하면서
                for (Contributor contributor : contributors) {
                    // 텍스트 뷰에 login 정보를 붙임
                    textView.append(contributor.login);

                }


            }

            @Override
            // 실패시
            public void onFailure(Call<List<Contributor>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "정보받아오기 실패", Toast.LENGTH_LONG)
                        .show();
            }
        });
    }
    public void init() {
        textView = (TextView) findViewById(R.id.textView);
        // GSON 컨버터를 사용하는 REST 어댑터 생성
        retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
            .build();
}



//        Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                GitHubService gitHubService = GitHubService.retrofit.create(GitHubService.class);
//                final Call<List<Contributor>> call = gitHubService.repoContributors("square", "retrofit");
//                new NetworkCall().execute(call);
//
//            }
//        });



}
