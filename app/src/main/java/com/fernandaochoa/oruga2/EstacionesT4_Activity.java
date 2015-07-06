package com.fernandaochoa.oruga2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class EstacionesT4_Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estaciones_t4_);

        List est_4 = new ArrayList();
        est_4.add("San Juan Bosco");
        est_4.add("Vista Hermosa");
        est_4.add("Santander");
        est_4.add("Cervantes");
        est_4.add("Espiritu Santo");
        est_4.add("Industrial");
        est_4.add("Valverde y Tellez");
        est_4.add("Apolo");
        est_4.add("Plaza del Mariachi");
        est_4.add("Centro Historico");
        est_4.add("Hermanos Aldama");
        est_4.add("La Paz");
        est_4.add("Expiatorio");
        est_4.add("Trigo");
        est_4.add("Zona Piel");
        est_4.add("Central Camionera");
        est_4.add("Poliforum");
        est_4.add("Bugambilias");
        est_4.add("Manzanares");
        est_4.add("San Pedro");
        est_4.add("Deportiva");

        ListView lst_estacionest4 = (ListView) findViewById(R.id.lst_estacionest4);
        ArrayAdapter menuAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, est_4);
        lst_estacionest4.setAdapter(menuAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_estaciones_t4_, menu);
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
