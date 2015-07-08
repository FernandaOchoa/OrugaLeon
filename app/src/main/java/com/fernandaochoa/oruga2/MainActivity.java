package com.fernandaochoa.oruga2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static com.fernandaochoa.oruga2.R.id.mapa;


public class MainActivity extends ActionBarActivity {

    public static GoogleAnalytics analytics;
    public static Tracker tracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Analitics para mi app
        analytics = GoogleAnalytics.getInstance(this);
        analytics.setLocalDispatchPeriod(1800);

        tracker = analytics.newTracker("UA-55563205-2");
        tracker.enableExceptionReporting(true);
        tracker.enableAdvertisingIdCollection(true);
        tracker.enableAutoActivityTracking(true);

        List menu = new ArrayList();
        menu.add("MAPA RED");
        menu.add("RUTAS");
        menu.add("PARADEROS");
        menu.add("FORMAS DE PAGO");
        ListView lst_menu = (ListView) findViewById(R.id.lst_menu);
        ArrayAdapter menuAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, menu);
        lst_menu.setAdapter(menuAdapter);

        lst_menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent i = new Intent(view.getContext(), MapaRedActivity.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent j = new Intent(view.getContext(), RutasActivity.class);
                        startActivity(j);
                        break;
                    case 2:
                        Intent k = new Intent(view.getContext(), ParaderosActivity.class);
                        startActivity(k);
                        break;
                    case 3:
                        Intent l = new Intent(view.getContext(), FormasPagoActivity.class);
                        startActivity(l);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu;
        //this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
