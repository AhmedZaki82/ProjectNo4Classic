package com.example.android.projectno4classic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Tsultrim on 4/24/18.
 */

public class ArtistsList extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists_list);

        LinearLayout beethoven = (LinearLayout) findViewById(R.id.beethoven);
        LinearLayout chopin = (LinearLayout) findViewById(R.id.chopin);
        LinearLayout tchaikovsky = (LinearLayout) findViewById(R.id.tchaikovsky);
        LinearLayout bach = (LinearLayout) findViewById(R.id.bach);
        LinearLayout mozart = (LinearLayout) findViewById(R.id.mozart);
        LinearLayout vivaldi = (LinearLayout) findViewById(R.id.vivaldi);
        LinearLayout rachmaninoff = (LinearLayout) findViewById(R.id.rachmaninoff);
        LinearLayout satie = (LinearLayout) findViewById(R.id.satie);

        beethoven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ArtistsList.this, getString(R.string.beethoven_list_j), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ArtistsList.this,BeethovenActivity.class);
                startActivity(i);
            }
        });


        chopin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ArtistsList.this, getString(R.string.chopin_list_j), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ArtistsList.this,ChopinActivity.class);
                startActivity(i);
            }
        });

        tchaikovsky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ArtistsList.this, getString(R.string.tchaikovsky_list_j), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ArtistsList.this,TchaikovskyActivity.class);
                startActivity(i);

            }
        });

        bach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ArtistsList.this, getString(R.string.chopin_list_j), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ArtistsList.this,BachActivity.class);
                startActivity(i);
            }
        });

        mozart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ArtistsList.this, getString(R.string.mozart_list_j), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ArtistsList.this,MozartActivity.class);
                startActivity(i);
            }
        });

        vivaldi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ArtistsList.this, getString(R.string.vivaldi_list_j), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ArtistsList.this,VivaldiActivity.class);
                startActivity(i);
            }
        });

        rachmaninoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ArtistsList.this, getString(R.string.rachmaninoff_list_j), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ArtistsList.this,RachmaninoffActivity.class);
                startActivity(i);
            }
        });

        satie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ArtistsList.this, getString(R.string.satie_list_j), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(ArtistsList.this,SatieActivity.class);
                startActivity(i);
            }
        });
    }

}
