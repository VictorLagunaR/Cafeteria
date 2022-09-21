package br.com.etecia.cafeteria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CoffeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext; //É a classe onde estou
    private List<Doces> mData; //O objeto que irá representar os dados

    public CoffeAdapter(Context mContext, List<Doces> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.fragment_coffee, parent, false);


        return new ViewHolder(view) {
        };
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        holder.

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
