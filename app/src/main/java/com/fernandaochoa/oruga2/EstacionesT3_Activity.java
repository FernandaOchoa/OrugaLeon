package com.fernandaochoa.oruga2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class EstacionesT3_Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estaciones_t3_);
        List est_3 = new ArrayList();
        est_3.add("San Juan Bosco");
        est_3.add("Vista Hermosa");
        est_3.add("Santander");
        est_3.add("Cervantes");
        est_3.add("Espiritu Santo");
        est_3.add("Industrial");
        est_3.add("Valverde y Tellez");
        est_3.add("Parque Hidalgo");
        est_3.add("Calvario");
        est_3.add("IMSS T-1");
        est_3.add("Insurgentes");
        est_3.add("Lluvia");
        est_3.add("Peñitas");
        est_3.add("Los Gomez");
        est_3.add("San Jeronimo");

        ListView lst_estacionest3 = (ListView) findViewById(R.id.lst_estacionest3);
        ArrayAdapter menuAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, est_3);
        lst_estacionest3.setAdapter(menuAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_estaciones_t3_, menu);
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
