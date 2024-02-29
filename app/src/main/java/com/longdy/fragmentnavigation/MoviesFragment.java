package com.longdy.fragmentnavigation;

// MoviesFragment.java

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MoviesFragment extends Fragment {

    private RecyclerView recyclerView;
    private SimpleListAdapter adapter;

    public MoviesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        String[] moviesList = new String[] {"Movie1", "Movie2", "Movie3", "Movie4","Movie5"};
        adapter = new SimpleListAdapter(moviesList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
