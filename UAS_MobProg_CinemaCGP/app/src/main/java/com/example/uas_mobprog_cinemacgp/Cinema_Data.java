package com.example.uas_mobprog_cinemacgp;

import java.util.ArrayList;
import java.util.List;

public class Cinema_Data {
    public static List<Cinema> getListCinema(){
        Cinema cinema1 = new Cinema(R.drawable.ic_cinemas, "Cinema CGP Alpha", -6.193924061113853, 106.78813220277623, "Alpha");
        Cinema cinema2 = new Cinema(R.drawable.ic_cinemas, "Cinema CGP Beta", -6.20175020412279, 106.78223868546155, "Beta");

        List<Cinema> list = new ArrayList<>();
        list.add(cinema1);
        list.add(cinema2);
        return list;
    }
}
