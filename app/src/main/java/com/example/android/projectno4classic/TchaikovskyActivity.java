package com.example.android.projectno4classic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TchaikovskyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tchaikovsky);

        ArrayList<Tchaikovsky> tchaikovskies = new ArrayList<>();

        tchaikovskies.add(new Tchaikovsky(R.drawable.tchaikovsky,"Tchaikovsky",
                "Clara And The Nutcracker","12:33",R.drawable.pause));

        tchaikovskies.add(new Tchaikovsky(R.drawable.tchaikovsky,"Tchaikovsky",
                "Waltz Of The Flowers","5:45",R.drawable.pause));

        tchaikovskies.add(new Tchaikovsky(R.drawable.tchaikovsky,"Tchaikovsky",
                "The Christmas Tree","8:12",R.drawable.pause));

        tchaikovskies.add(new Tchaikovsky(R.drawable.tchaikovsky,"Tchaikovsky",
                "Pas De Deux: Coda","7:52",R.drawable.pause));

        tchaikovskies.add(new Tchaikovsky(R.drawable.tchaikovsky,"Tchaikovsky",
                "March","6:27",R.drawable.pause));

        ListView listView = findViewById(R.id.tchaikovskyList);
        TchaikovskyAdapter tchaikovskyAdapter = new TchaikovskyAdapter(TchaikovskyActivity.this,tchaikovskies);
        listView.setAdapter(tchaikovskyAdapter);
    }
}
