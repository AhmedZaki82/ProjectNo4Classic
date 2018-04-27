package com.example.android.projectno4classic;

/**
 * Created by Tsultrim on 4/27/18.
 */

public class Satie {

    private int mImage;
    private String mName;
    private String mTrack;
    private String mTime;
    private int mPlay;

    public Satie(int mImage, String mName, String mTrack, String mTime, int mPlay) {
        this.mImage = mImage;
        this.mName = mName;
        this.mTrack = mTrack;
        this.mTime = mTime;
        this.mPlay = mPlay;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmName() {
        return mName;
    }

    public String getmTrack() {
        return mTrack;
    }

    public String getmTime() {
        return mTime;
    }

    public int getmPlay() {
        return mPlay;
    }
}
