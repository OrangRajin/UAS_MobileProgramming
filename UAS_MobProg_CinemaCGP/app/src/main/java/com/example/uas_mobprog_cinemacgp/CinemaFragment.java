package com.example.uas_mobprog_cinemacgp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CinemaFragment extends Fragment {

    private RecyclerView rv;
    private ArrayList<Cinema> list = new ArrayList<>();

    public CinemaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cinema, container, false);
        rv = view.findViewById(R.id.cinemaFragment);
        rv.setHasFixedSize(true);

        list.addAll(Cinema_Data.getListCinema());
        showRecyclerList();

        return view;
    }

    private void showRecyclerList() {
        rv.setLayoutManager(new LinearLayoutManager(this.getContext()));
        CinemaListAdapter cinemaListAdapter = new CinemaListAdapter(list, requireContext());
        cinemaListAdapter.setListCinema(list);
        rv.setAdapter(cinemaListAdapter);
    }
}