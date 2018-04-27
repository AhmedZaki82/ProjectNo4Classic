package com.example.android.projectno4classic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RachmaninoffActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rachmaninoff);

        ArrayList<Rachmaninoff> rachmaninoffs = new ArrayList<>();

        rachmaninoffs.add(new Rachmaninoff(R.drawable.rachmaninoff,"Rachmaninoff",
                "Scherzo in D minor","13:22",R.drawable.pause));

        rachmaninoffs.add(new Rachmaninoff(R.drawable.rachmaninoff,"Rachmaninoff",
                "Caprice bohémien","7:16",R.drawable.pause));

        rachmaninoffs.add(new Rachmaninoff(R.drawable.rachmaninoff,"Rachmaninoff",
                "Prince Rostislav","9:43",R.drawable.pause));

        rachmaninoffs.add(new Rachmaninoff(R.drawable.rachmaninoff,"Rachmaninoff",
                "The Rock","11:35",R.drawable.pause));

        rachmaninoffs.add(new Rachmaninoff(R.drawable.rachmaninoff,"Rachmaninoff",
                "Manfred","5:33",R.drawable.pause));

        ListView listView = (ListView) findViewById(R.id.rachmaninoffList);
        RachmaninoffAdapter rachmaninoffAdapter = new RachmaninoffAdapter(RachmaninoffActivity.this
        ,rachmaninoffs);
        listView.setAdapter(rachmaninoffAdapter);
    }
}
