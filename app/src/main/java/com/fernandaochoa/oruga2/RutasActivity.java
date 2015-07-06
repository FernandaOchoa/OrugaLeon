package com.fernandaochoa.oruga2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class RutasActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutas);
        List rutas = new ArrayList();
        rutas.add("T1 \n San Jeronimo - Delta");
        rutas.add("T2 \n San Jeronimo - Delta");
        rutas.add("T3 \n San Juan Bosco - San Jeronimo");
        rutas.add("T4 \n San Juan Bosco - Deportiva");
        rutas.add("T5 \n San Juan Bosco - Santa Rita");
        ListView lst_rutas = (ListView) findViewById(R.id.lst_rutas);
        ArrayAdapter menuAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, rutas);
        lst_rutas.setAdapter(menuAdapter);

        lst_rutas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent i = new Intent(view.getContext(), EstacionesT1_Activity.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent j = new Intent(view.getContext(), EstacionesT2_Activity.class);
                        startActivity(j);
                        break;
                    case 2:
                        Intent k = new Intent(view.getContext(), EstacionesT3_Activity.class);
                        startActivity(k);
                        break;
                    case 3:
                        Intent l = new Intent(view.getContext(), EstacionesT4_Activity.class);
                        startActivity(l);
                        break;
                    case 4:
                        Intent m = new Intent(view.getContext(), EstacionesT5_Activity.class);
                        startActivity(m);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rutas, menu);
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
