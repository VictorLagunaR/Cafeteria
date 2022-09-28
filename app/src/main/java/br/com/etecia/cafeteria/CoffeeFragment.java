package br.com.etecia.cafeteria;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class CoffeeFragment extends Fragment {
    RecyclerView recyclerView;
    List<Coffee> mData; //O objeto que irá representar os dados

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_coffee, container, false);

        recyclerView = v.findViewById(R.id.rvCoffee);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.hasFixedSize();

        mData = new ArrayList<>();

        mData.add(new Coffee("Café com leite",R.drawable.cafeleite, "Café com leite gostosinho",5));
        mData.add(new Coffee("Cappuccino",R.drawable.cappuccino, "Cappuccino deliciosinho",5));
        mData.add(new Coffee("Expresso",R.drawable.expresso, "Café expresso gostosinho",5));
        mData.add(new Coffee("Café com leite",R.drawable.cafeleite, "Café com leite gostosinho",5));
        mData.add(new Coffee("Cappuccino",R.drawable.cappuccino, "Cappuccino deliciosinho",5));
        mData.add(new Coffee("Expresso",R.drawable.expresso, "Café expresso gostosinho",5));

        CoffeeAdapter cafeAdapter = new CoffeeAdapter(getContext(),mData);
        recyclerView.setAdapter(cafeAdapter);

        return v;
    }

}

