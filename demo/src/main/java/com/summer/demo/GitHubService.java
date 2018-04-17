package com.summer.demo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubService {
  @GET("/server/server/getAllVideosByGet")
  Call<ResponseBody> listRepos();
}