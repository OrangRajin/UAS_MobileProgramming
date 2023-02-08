package com.example.uas_mobprog_cinemacgp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.w3c.dom.Text;

public class Cinema_DetailActivity extends AppCompatActivity implements OnMapReadyCallback {

    private Cinema cinema;
    public static final String ITEM_EXTRA="item extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinema_detail);

        ImageView imgItem = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvAddress = findViewById(R.id.tv_item_address);
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.map_detail);
        if(mapFragment != null){
            mapFragment.getMapAsync(this);
        }

        cinema = getIntent().getParcelableExtra(ITEM_EXTRA);

        if(cinema != null){
            Glide.with(this)
                    .load(cinema.getImage())
                    .into(imgItem);
            tvName.setText(cinema.getName());
            Log.e("LAT", String.valueOf(cinema.getLatitude()));
            Log.e("LNG", String.valueOf(cinema.getLongitude()));
            tvAddress.setText(cinema.getAddress());
        }

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Detail Cinema");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng latLng;
        if(cinema != null){
            latLng = new LatLng(cinema.getLatitude(), cinema.getLongitude());
        }else{
            latLng = new LatLng(6.193924061113853, 106.7881322027762);
        }

        MarkerOptions options = new MarkerOptions();
        options.position(latLng).title(cinema.getAddress());
        googleMap.addMarker(options);
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
    }
}