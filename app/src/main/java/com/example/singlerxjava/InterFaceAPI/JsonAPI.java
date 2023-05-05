package com.example.singlerxjava.InterFaceAPI;

import com.example.singlerxjava.model.user;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface JsonAPI {
   @GET ("User")
   Single <List<user>> setSingle();
}
