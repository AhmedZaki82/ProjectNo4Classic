package com.example.android.projectno4classic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ChopinActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chopin);

        ArrayList<Chopin> chopins = new ArrayList<>();

        chopins.add(new Chopin(R.drawable.chopin,"Chopin","Waltz in c sharp minor"
                ,"7:35",R.drawable.pause));

        chopins.add(new Chopin(R.drawable.chopin,"Chopin","Fantasie-impromptu"
                ,"6:24",R.drawable.pause));

        chopins.add(new Chopin(R.drawable.chopin,"Chopin","The Funeral March"
                ,"2:20",R.drawable.pause));

        chopins.add(new Chopin(R.drawable.chopin,"Chopin","Black Key Etude"
                ,"3:17",R.drawable.pause));

        chopins.add(new Chopin(R.drawable.chopin,"Chopin","Minute waltz"
                ,"2:14",R.drawable.pause));

        ChopinAdapter chopinAdapter = new ChopinAdapter(this,chopins);
        ListView listView = (ListView) findViewById(R.id.chopinList);
        listView.setAdapter(chopinAdapter);
    }
}
