package com.jalasoft.models;

public class Movie extends Price {
    private String _title;

    public Movie(String title) {
        _title = title;
    }

    public String getTitle() {
        return _title;
    }


    @Override
    public int getPriceCode() {

    }
}
