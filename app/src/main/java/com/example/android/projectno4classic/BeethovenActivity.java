package com.example.android.projectno4classic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BeethovenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beethoven);

        ArrayList<Beethoven> beethovens = new ArrayList<>();

        beethovens.add(new Beethoven(R.drawable.beethoven,"Beethoven","Moonlight Sonata",
                "15:00",R.drawable.pause));

        beethovens.add(new Beethoven(R.drawable.beethoven,"Beethoven","Symphony No. 9 (Scherzo)",
                "24:45",R.drawable.pause));

        beethovens.add(new Beethoven(R.drawable.beethoven,"Beethoven","Für Elise",
                "7:20",R.drawable.pause));

        beethovens.add(new Beethoven(R.drawable.beethoven,"Beethoven","Molto vivace",
                "16:33",R.drawable.pause));

        beethovens.add(new Beethoven(R.drawable.beethoven,"Beethoven","Ode to Joy",
                "9:47",R.drawable.pause));

        BeethovenAdapter beethovenAdapter = new BeethovenAdapter(this,beethovens);
        ListView listView = (ListView) findViewById(R.id.beethovenList);
        listView.setAdapter(beethovenAdapter);
    }
}
