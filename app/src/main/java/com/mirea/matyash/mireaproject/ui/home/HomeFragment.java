package com.mirea.matyash.mireaproject.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.mirea.matyash.mireaproject.MainActivity;
import com.mirea.matyash.mireaproject.R;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MainActivity.fab.setVisibility(View.VISIBLE);
        MainActivity.navigationView.setVisibility(View.VISIBLE);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        TextView welcomeText = root.findViewById(R.id.tv_emailWelcome);
        welcomeText.setText(MainActivity.email);
        return root;
    }
}