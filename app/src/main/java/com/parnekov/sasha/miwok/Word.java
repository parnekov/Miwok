package com.parnekov.sasha.miwok;

public class Word {
    private String mdefaultTranslation;
    private String mMiwokTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mSoundResourseId;


    public Word(String defaultTranslation, String miwokTranslation, int soundResourseId) {
        mdefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourseId = soundResourseId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourseId) {
        mdefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourseId = soundResourseId;

    }

    public String getDefaultTranslation() {
        return mdefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getSoundResourseId(){
        return mSoundResourseId;
    }
}