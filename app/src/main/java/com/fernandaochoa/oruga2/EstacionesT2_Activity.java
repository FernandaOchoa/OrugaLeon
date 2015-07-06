package com.fernandaochoa.oruga2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class EstacionesT2_Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estaciones_t2_);
        List est_2 = new ArrayList();
        est_2.add("San Jeronimo");
        est_2.add("Florida");
        est_2.add("Guanajuato");
        est_2.add("Los Reyes");
        est_2.add("Michoacan");
        est_2.add("Hospital General");
        est_2.add("Moctezuma");
        est_2.add("Centro Historico");
        est_2.add("Plaza del Mariachi");
        est_2.add("Soledad");
        est_2.add("Reforma");
        est_2.add("Centro de Salud");
        est_2.add("Justo Sierra");
        est_2.add("Monumento a la Madre");
        est_2.add("Vips T-21");
        est_2.add("Los Fresnos");
        est_2.add("San Miguel");
        est_2.add("Tierra Blanca");
        est_2.add("Preparatoria");
        est_2.add("Buenos Aires");
        est_2.add("Sapal");
        est_2.add("Francisco Villa Sur");
        est_2.add("Centro Ciudadano");
        est_2.add("Azteca");
        est_2.add("Issste");
        est_2.add("San Isidro");
        est_2.add("Paseo de Jerez");
        est_2.add("Bocanegra");
        est_2.add("Deportiva");
        est_2.add("Julian de Obregon");
        est_2.add("Cerrito de Jerez");
        est_2.add("Delta");

        ListView lst_estacionest2 = (ListView) findViewById(R.id.lst_estacionest2);
        ArrayAdapter menuAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, est_2);
        lst_estacionest2.setAdapter(menuAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_estaciones_t2_, menu);
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
