package com.mirea.matyash.mireaproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SimplePlayer extends Fragment {

    public SimplePlayer() {
        // Required empty public constructor
    }

    public static SimplePlayer newInstance(String param1, String param2) {
        SimplePlayer fragment = new SimplePlayer();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple_player, container, false);
    }
}