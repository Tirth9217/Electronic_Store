package com.example.tirthnileshbhaipatel_individualproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;


import androidx.appcompat.app.AppCompatActivity;

public class StartMain extends AppCompatActivity {
    private static int START_SCREEN_TIMEOUT=3000;

    @Override
    protected  void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.start_main);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(StartMain.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, START_SCREEN_TIMEOUT);
    }
}
