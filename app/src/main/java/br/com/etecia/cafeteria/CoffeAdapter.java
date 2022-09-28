package br.com.etecia.cafeteria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CoffeAdapter extends RecyclerView.Adapter<CoffeAdapter.ViewHolder>{

    private Context mContext; //É a classe onde estou
    private List<Coffee> mData; //O objeto que irá representar os dados

    public CoffeAdapter(Context mContext, List<Coffee> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public CoffeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        view = inflater.inflate(R.layout.modelo, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nomeCard.setText(mData.get(position).getTitulo());
        holder.imagemCard.setImageResource(mData.get(position).getFoto());
        holder.descCard.setText(mData.get(position).getDesc());
        holder.ratingCard.setNumStars(mData.get(position).getRating());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nomeCard;
        ImageView imagemCard;
        TextView descCard;
        RatingBar ratingCard;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeCard.findViewById(R.id.cafeTitulo);
            imagemCard.findViewById(R.id.cafeImg);
            descCard.findViewById(R.id.cafeDescricao);
            ratingCard.findViewById(R.id.cafeRating);

        }
    }
}
