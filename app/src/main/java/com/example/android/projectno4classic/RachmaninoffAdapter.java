package com.example.android.projectno4classic;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Tsultrim on 4/27/18.
 */

public class RachmaninoffAdapter extends ArrayAdapter<Rachmaninoff> {

    public RachmaninoffAdapter(@NonNull Context context, @NonNull List<Rachmaninoff> rachmaninoffs) {
        super(context, 0, rachmaninoffs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;
        Rachmaninoff currentItem = getItem(position);

        if (listView == null) {

            listView = LayoutInflater.from(getContext()).inflate(R.layout.artist_music,parent,
                    false);
        }

        ImageView imageView = (ImageView) listView.findViewById(R.id.imageArtist);
        imageView.setImageResource(currentItem.getmImage());

        ImageView imageView1 = (ImageView) listView.findViewById(R.id.imagePlay);
        imageView1.setImageResource(currentItem.getmPlay());

        TextView textName = (TextView) listView.findViewById(R.id.textName);
        textName.setText(currentItem.getmName());

        TextView textTrack = (TextView) listView.findViewById(R.id.textTrack);
        textTrack.setText(currentItem.getmTrack());

        TextView textTime = (TextView) listView.findViewById(R.id.textAge);
        textTime.setText(currentItem.getmTime());

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Listen to the silence? it's a demo version, dude :)", Toast.LENGTH_LONG).show();
            }
        });

        return listView;
    }

}
