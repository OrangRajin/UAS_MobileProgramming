package com.example.uas_mobprog_cinemacgp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class Movie_DetailActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        ImageView imgItem = findViewById(R.id.img_poster);
        TextView title = findViewById(R.id.tv_judul);
        TextView overview = findViewById(R.id.tv_detail);
        TextView genre = findViewById(R.id.tv_genre);
        TextView rating = findViewById(R.id.tv_rating);

        Movie movie = getIntent().getParcelableExtra(ITEM_EXTRA);

        if(movie != null){
            Glide.with(this)
                    .load(movie.getImage())
                    .into(imgItem);
            title.setText(movie.getTitle());
            overview.setText(movie.getDescription());
            genre.setText(movie.getGenre());
            rating.setText(movie.getRating());
        }

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Movie");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}