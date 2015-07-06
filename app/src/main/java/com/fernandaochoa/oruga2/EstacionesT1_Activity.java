package com.fernandaochoa.oruga2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class EstacionesT1_Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estaciones_t1_);
        List est_t1 = new ArrayList();
        est_t1.add("San Jeronimo");
        est_t1.add("Los Gomez");
        est_t1.add("Peñitas");
        est_t1.add("Lluvia");
        est_t1.add("Insurgentes");
        est_t1.add("IMSS T-1");
        est_t1.add("Calvario");
        est_t1.add("Parque Hidalgo");
        est_t1.add("Apolo");
        est_t1.add("Plaza del Mariachi");
        est_t1.add("Centro Historico");
        est_t1.add("Hermanos Aldama");
        est_t1.add("La Paz");
        est_t1.add("Expiatorio");
        est_t1.add("Trigo");
        est_t1.add("Zona Piel");
        est_t1.add("Central Camionera");
        est_t1.add("Poliforum");
        est_t1.add("Bugambilias");
        est_t1.add("Manzanares");
        est_t1.add("San Pedro");
        est_t1.add("Deportiva");
        est_t1.add("Julian de Obregon");
        est_t1.add("Cerrito de Jerez");
        est_t1.add("Delta");
        ListView lst_estacionest1 = (ListView) findViewById(R.id.lst_estacionest1);
        ArrayAdapter menuAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, est_t1);
        lst_estacionest1.setAdapter(menuAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_estaciones_t1_, menu);
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
