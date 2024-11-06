package com.example.ods.service;

import com.example.ods.domain.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserAPI {
    @GET("/users/all")
    Call<List<User>> getAll();
    @GET("/users/user/{id}")
    Call<List<User>> getById(@Path("id") Integer id);

}
