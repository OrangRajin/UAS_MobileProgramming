package com.example.uas_mobprog_cinemacgp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CinemaListAdapter extends RecyclerView.Adapter<CinemaListAdapter.ListViewHolder> {

    private Context context;
    private ArrayList<Cinema> listCinema;

    public ArrayList<Cinema> getListCinema(){
        return listCinema;
    }

    public void setListCinema(ArrayList<Cinema> listCinema){
        this.listCinema = listCinema;
    }

    public CinemaListAdapter(ArrayList<Cinema> list, Context context){
        this.listCinema = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cinema_card_view, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Cinema cinema = listCinema.get(position);
        Glide.with(holder.itemView.getContext())
                .load(cinema.getImage())
                .apply(new RequestOptions().override(50,50))
                .into(holder.imgPhoto);
        holder.tvName.setText(cinema.getName());
    }

    @Override
    public int getItemCount() {
        return listCinema.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvName, tvAddress;
        public ListViewHolder(View view) {
            super(view);
            imgPhoto = view.findViewById(R.id.img_Logo_cinema);
            tvName = view.findViewById(R.id.cinema_item_name);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Cinema cinema = getListCinema().get(position);
            Intent intent = new Intent(context, Cinema_DetailActivity.class);
            intent.putExtra(Cinema_DetailActivity.ITEM_EXTRA, cinema);
            context.startActivity(intent);
        }
    }
}
