package com.example.productapplication.data.utils;

public enum DiscContent {
    MUSIC("Музыка"),
    VIDEO("Видео"),
    SOFTWARE("ПО");

    private String title;

    DiscContent(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
