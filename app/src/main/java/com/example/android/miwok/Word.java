package com.example.android.miwok;

/**
 * Created by Abhinay on 21-Mar-17.
 */

public class Word {
    private String mDefaulttranlsation;
    private String mMiwoktranlsation;
    private int mimageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    public Word(String defaulttranlsation,String miwoktranlsation, int audioResourceId){
        mDefaulttranlsation = defaulttranlsation;
        mMiwoktranlsation = miwoktranlsation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaulttranlsation,String miwoktranlsation,int imageResourceID,int audioResourceId){
        mDefaulttranlsation = defaulttranlsation;
        mMiwoktranlsation = miwoktranlsation;
        mimageResourceID = imageResourceID;
        mAudioResourceId = audioResourceId;
    }
    //* Get Default tranlation
    public String getDefaulttranlsation(){
        return mDefaulttranlsation;
    }
    //* Get Miwok tranlation
    public String getMiwoktranlsation(){
        return mMiwoktranlsation;
    }
    //*Get Image resource ID
    public int getimageResourceID(){ return mimageResourceID;}

    //*Return whether image is there or not
    public boolean hasImage(){
        return mimageResourceID != NO_IMAGE_PROVIDED;
    }

    //Returns resource id of audio file
    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
