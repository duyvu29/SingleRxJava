package com.example.singlerxjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.singlerxjava.APIRetrofit.RxJavaAPI;
import com.example.singlerxjava.InterFaceAPI.JsonAPI;
import com.example.singlerxjava.model.user;

import java.util.List;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    Button btnGet, btnPost, btnPut, btnDelete;
    private JsonAPI interSingle;
    private static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ánh xạ
        maaping();
        // sự kiện
        event();

        interSingle = new RxJavaAPI().getJsonAPI();

    }

    private void event() {
       // interSingle = new RxJavaAPI().getJsonAPI();
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                interSingle.setSingle().subscribe(new SingleObserver<List<user>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(List<user> users) {
                        Log.d(TAG, "onSuccess: " + users.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: "+ e.getMessage());

                    }
                });

            }
        });
    }

    private void maaping() {
        btnGet = findViewById(R.id.btnGet);
        btnPost = findViewById(R.id.btnPost);
        btnPut  = findViewById(R.id.btnPut);
        btnDelete   = findViewById(R.id.btnDelete);
    }
}