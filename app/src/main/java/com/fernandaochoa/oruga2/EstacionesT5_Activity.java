package com.fernandaochoa.oruga2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class EstacionesT5_Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estaciones_t5_);

        List est_5 = new ArrayList();
        est_5.add("San Juan Bosco");
        est_5.add("Vista Hermosa");
        est_5.add("Santander");
        est_5.add("Cervantes");
        est_5.add("Espiritu Santo");
        est_5.add("Industrial");
        est_5.add("Valverde y Tellez");
        est_5.add("Apollo");
        est_5.add("Soledad");
        est_5.add("Reforma");
        est_5.add("Centro de Salud");
        est_5.add("Justo Sierra");
        est_5.add("Monumento a la Madre");
        est_5.add("IMSS T-21");
        est_5.add("Los Fresnos");
        est_5.add("Los Limones");
        est_5.add("Americas");
        est_5.add("Gaona");
        est_5.add("V.Carranza");
        est_5.add("Santa Ritas");

        ListView lst_estacionest5 = (ListView) findViewById(R.id.lst_estacionest5);
        ArrayAdapter menuAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, est_5);
        lst_estacionest5.setAdapter(menuAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_estaciones_t5_, menu);
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
