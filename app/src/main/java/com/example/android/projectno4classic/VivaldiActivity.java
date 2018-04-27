package com.example.android.projectno4classic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class VivaldiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vivaldi);

        ArrayList<Vivaldi> vivaldis = new ArrayList<>();

        vivaldis.add(new Vivaldi(R.drawable.vivaldi,"Vivaldi","Die vier Jahreszeiten","7:13",
                R.drawable.pause));

        vivaldis.add(new Vivaldi(R.drawable.vivaldi,"Vivaldi","Gloria in excelsis Deo","11:30",
                R.drawable.pause));

        vivaldis.add(new Vivaldi(R.drawable.vivaldi,"Vivaldi","Four Seasons","5:22",
                R.drawable.pause));

        vivaldis.add(new Vivaldi(R.drawable.vivaldi,"Vivaldi","Andante","3:17",
                R.drawable.pause));

        vivaldis.add(new Vivaldi(R.drawable.vivaldi,"Vivaldi","Presto","9:53",
                R.drawable.pause));

        ListView listView = (ListView) findViewById(R.id.vivaldiList);
        VivaldiAdapter vivaldiAdapter = new VivaldiAdapter(VivaldiActivity.this,vivaldis);
        listView.setAdapter(vivaldiAdapter);
    }
}
