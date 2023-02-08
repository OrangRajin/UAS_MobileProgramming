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

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Movie> movieList;

    public ArrayList<Movie> getMovieList(){
        return movieList;
    }

    public void setMovieList(ArrayList<Movie> movieList){
        this.movieList = movieList;

    }

    public MovieAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public MovieAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_movie_cardview, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int position) {
        Movie movie = getMovieList().get(position);
        Glide.with(context)
                .load(movie.getImage())
                .apply(new RequestOptions().override(350,550))
                .into(cardViewViewHolder.imagePhoto);
        cardViewViewHolder.tvtTitle.setText(movie.getTitle());
    }

    @Override
    public int getItemCount() {
        return getMovieList().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imagePhoto;
        TextView tvtTitle;

        CardViewViewHolder(@NonNull final View itemView){
            super(itemView);

            imagePhoto = itemView.findViewById(R.id.imagecover);
            tvtTitle = itemView.findViewById(R.id.textTitle);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Movie movie = getMovieList().get(position);

            Intent intent = new Intent(context, Movie_DetailActivity.class);
            intent.putExtra(Movie_DetailActivity.ITEM_EXTRA, movie);
            context.startActivity(intent);
        }
    }
}
