package com.mchavez.pettabbed;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import com.mchavez.pettabbed.PetAdapter;


public class Fragment_RV extends Fragment {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rv_fragment;
    private PetAdapter adapter;

    public Fragment_RV() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_rv, container, false);
        rv_fragment = (RecyclerView) v.findViewById(R.id.rvPets);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_fragment.setLayoutManager(llm);

        adapter = new PetAdapter();
        rv_fragment.setAdapter(adapter);

        adapter.agregaPets(new Mascota(R.drawable.pet1, "Choki", "10"));
        adapter.agregaPets(new Mascota(R.drawable.pet2, "Ruffo", "8"));
        adapter.agregaPets(new Mascota(R.drawable.pet3, "Lola", "6"));
        adapter.agregaPets(new Mascota(R.drawable.pet4, "Krali", "8"));
        adapter.agregaPets(new Mascota(R.drawable.pet5, "Peli", "7"));
        adapter.agregaPets(new Mascota(R.drawable.pet6, "Truco", "9"));
        adapter.agregaPets(new Mascota(R.drawable.pet7, "Timmy", "9"));
        adapter.agregaPets(new Mascota(R.drawable.pet8, "Babe", "7"));
        adapter.agregaPets(new Mascota(R.drawable.pet9, "Kapi", "10"));

        return v;
    }
}

