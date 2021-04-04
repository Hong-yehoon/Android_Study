package com.example.splash;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

        @Override
        public void onCreate( Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();

        }
    }


// postDelayed 를 사용한 splash
/*
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();

        //스플래시화면을 2초간 보여준다
        handler.postDelayed(new splashhandler(), 2000);

    }

private class splashhandler implements Runnable{

    @Override
    public void run() {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        Splash.this.finish(); //stack에서 제거
    }
}*/
