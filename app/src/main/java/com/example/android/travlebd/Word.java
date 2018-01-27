package com.example.android.travlebd;

/**
 * Created by LENOVO on 11/8/2017.
 */

public class Word {

    private String placeName;
    private String placeAdd;

    public Word(String placeName, String placeAdd) {
        this.placeName = placeName;
        this.placeAdd = placeAdd;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceAdd() {
        return placeAdd;
    }
}
