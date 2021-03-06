package com.mchavez.pettabbed;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import com.mchavez.pettabbed.PetAdapter;
import com.mikhaellopez.circularimageview.CircularImageView;


public class Fragment2 extends Fragment {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rv_fragment;
    private PetAdapter2 adapter2;
    private CircularImageView circulo;

    public Fragment2() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_2, container, false);
        rv_fragment = (RecyclerView) v.findViewById(R.id.rvPets2);
        CircularImageView circulo = v.findViewById(R.id.circular_image); //### OJO AL PIOJO!!

        GridLayoutManager glm = new GridLayoutManager(getActivity(), 3);
        glm.setOrientation(GridLayoutManager.VERTICAL);
        rv_fragment.setLayoutManager(glm);

        adapter2 = new PetAdapter2();
        rv_fragment.setAdapter(adapter2);

        adapter2.agregaPets(new Mascota(R.drawable.pet1, "Choki", "10"));
        adapter2.agregaPets(new Mascota(R.drawable.pet2, "Ruffo", "8"));
        adapter2.agregaPets(new Mascota(R.drawable.pet3, "Lola", "6"));
        adapter2.agregaPets(new Mascota(R.drawable.pet4, "Krali", "8"));
        adapter2.agregaPets(new Mascota(R.drawable.pet5, "Peli", "7"));
        adapter2.agregaPets(new Mascota(R.drawable.pet6, "Truco", "9"));
        adapter2.agregaPets(new Mascota(R.drawable.pet7, "Timmy", "9"));
        adapter2.agregaPets(new Mascota(R.drawable.pet8, "Babe", "7"));
        adapter2.agregaPets(new Mascota(R.drawable.pet9, "Kapi", "10"));

        return v;
    }
}

