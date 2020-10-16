package net.ivanvega.audiolibros2020;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SelectorFragment extends Fragment {
    RecyclerView recycle;
    private AdaptadorLibros adapter;
    private GridLayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_layout_listener,null);
        recycle = v.findViewById(R.id.recyclerView3);
        layoutManager = new GridLayoutManager(getActivity(),2);
        recycle.setLayoutManager(layoutManager);
        adapter = new AdaptadorLibros(getActivity(),Libro.ejemploLibros());
        recycle.setAdapter(adapter);
        return v;
        
    }
}