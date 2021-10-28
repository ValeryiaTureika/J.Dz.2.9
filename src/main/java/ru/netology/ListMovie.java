package ru.netology;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class ListMovie {

    private String id;
    private String imageUrl;
    private String name;
    private String genre;
    private boolean premiereTomorrow;
}
