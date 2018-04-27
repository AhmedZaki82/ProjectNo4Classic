package com.example.android.projectno4classic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MozartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mozart);

        ArrayList<Mozart> mozarts = new ArrayList<>();

        mozarts.add(new Mozart(R.drawable.mozart,"Mozart","The Marriage Of Figaro","7:32",
                R.drawable.pause));

        mozarts.add(new Mozart(R.drawable.mozart,"Mozart","The Magic Flute","4:43",
                R.drawable.pause));

        mozarts.add(new Mozart(R.drawable.mozart,"Mozart","Don Giovanni","12:23",
                R.drawable.pause));

        mozarts.add(new Mozart(R.drawable.mozart,"Mozart","Cosi fan tutte","17:45",
                R.drawable.pause));

        mozarts.add(new Mozart(R.drawable.mozart,"Mozart","Requiem","9:36",
                R.drawable.pause));

        ListView listView = (ListView) findViewById(R.id.mozartList);
        MozartAdapter mozartAdapter = new MozartAdapter(MozartActivity.this,mozarts);
        listView.setAdapter(mozartAdapter);
    }
}
