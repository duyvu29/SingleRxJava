package com.example.singlerxjava.APIRetrofit;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RxJavaAPI {
    // 20230504152723
    // https://644b7f804bdbc0cc3a92f2e2.mockapi.io/rxjava/information/User

    public static com.example.singlerxjava.InterFaceAPI.JsonAPI single;

    public com.example.singlerxjava.InterFaceAPI.JsonAPI getJsonAPI() {

        //Gson gson = new GsonBuilder().setLenient().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://644b7f804bdbc0cc3a92f2e2.mockapi.io/rxjava/information/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        single = retrofit.create(com.example.singlerxjava.InterFaceAPI.JsonAPI.class);
        return single;
    }
}
