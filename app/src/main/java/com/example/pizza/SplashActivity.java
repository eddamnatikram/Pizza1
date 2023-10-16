package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Créez un Thread pour gérer le délai et la transition vers l'activité suivante
        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000); // Délai de 2 secondes (2000 millisecondes)
                    Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splashThread.start();
    }
}
