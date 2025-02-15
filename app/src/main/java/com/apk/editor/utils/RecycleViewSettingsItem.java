package com.apk.editor.utils;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/*
 * Created by APK Explorer & Editor <apkeditor@protonmail.com> on March 31, 2021
 */
public class RecycleViewSettingsItem implements Serializable {

    private String mTitle;
    private String mDescription;
    private Drawable mIcon;

    public RecycleViewSettingsItem(String title, String description, Drawable icon) {
        this.mTitle = title;
        this.mDescription = description;
        this.mIcon = icon;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public Drawable getIcon() {
        return mIcon;
    }

}