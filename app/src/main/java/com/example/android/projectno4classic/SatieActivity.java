package com.example.android.projectno4classic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SatieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satie);

        ArrayList<Satie> saties = new ArrayList<>();

        saties.add(new Satie(R.drawable.satie,"Satie","Véritables préludes flasques","7:33",
                R.drawable.pause));

        saties.add(new Satie(R.drawable.satie,"Satie","Musique d’ameublement","12:45",
                R.drawable.pause));

        saties.add(new Satie(R.drawable.satie,"Satie","La diva de l’empire","9:12",
                R.drawable.pause));

        saties.add(new Satie(R.drawable.satie,"Satie","Gymnopédies","4:52",
                R.drawable.pause));

        saties.add(new Satie(R.drawable.satie,"Satie","Vexations","15:27",
                R.drawable.pause));

        ListView listView = (ListView) findViewById(R.id.satieList);
        SatieAdapter satieAdapter = new SatieAdapter(SatieActivity.this,saties);
        listView.setAdapter(satieAdapter);

    }
}
