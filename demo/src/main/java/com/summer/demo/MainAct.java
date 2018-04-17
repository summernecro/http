package com.summer.demo;

//by summer on 2018-04-16.

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.summer.demo.databinding.LayoutBinding;

import java.io.IOException;
import java.io.Reader;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainAct extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = LayoutInflater.from(this).inflate(R.layout.layout,null);
        LayoutBinding layoutBinding = DataBindingUtil.bind(view);
        setContentView(layoutBinding.getRoot());




        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.summernecro.com:8888")
                .build();

        GitHubService service = retrofit.create(GitHubService.class);
        service.listRepos().enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.e("onResponse",""+call);
                try {
                    Log.e("", response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.e("onResponse",""+call);
            }
        });

    }
}
