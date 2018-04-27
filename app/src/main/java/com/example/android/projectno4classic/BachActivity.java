package com.example.android.projectno4classic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bach);

        ArrayList<Bach> baches = new ArrayList<>();

        baches.add(new Bach(R.drawable.bach,"Bach","Prelude for Organ Chorale","6:45",
                R.drawable.pause));

        baches.add(new Bach(R.drawable.bach,"Bach","Fugue in D Minor","3:22",
                R.drawable.pause));

        baches.add(new Bach(R.drawable.bach,"Bach","Sinfonia","7:30",
                R.drawable.pause));

        baches.add(new Bach(R.drawable.bach,"Bach","Canon","9:51",
                R.drawable.pause));

        baches.add(new Bach(R.drawable.bach,"Bach","Aria","4:13",
                R.drawable.pause));

        ListView listView = (ListView) findViewById(R.id.bachList);
        BachAdapter bachAdapter = new BachAdapter(BachActivity.this,baches);
        listView.setAdapter(bachAdapter);
    }
}
