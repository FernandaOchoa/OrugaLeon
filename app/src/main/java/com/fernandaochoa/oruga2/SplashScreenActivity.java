package com.fernandaochoa.oruga2;

/**
 * Created by Fernanda Ochoa on 15/05/2015.
 */
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

public class SplashScreenActivity extends Activity {

    // Defino la duracion del splash screen
    private static final long SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Asigno la orientacion portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // Oculto la barra de titulo
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.splash_screen);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                // Inicia la siguiente actividad
                Intent mainIntent = new Intent().setClass(
                        SplashScreenActivity.this, MainActivity.class);
                startActivity(mainIntent);

                // Cierra la actividad para que el usuario no quiera salirse
                // presionando el boton atras
                finish();
            }
        };

        // Simula un proceso largo de inicio de aplicacion
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }

}

