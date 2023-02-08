package com.example.uas_mobprog_cinemacgp;

import android.view.View;

public class OnItemClickListenerCustom implements View.OnClickListener {

    private int position;
    private OnItemClickCallback onItemClickCallback;

    public OnItemClickListenerCustom(int position, OnItemClickCallback onItemClickCallback){
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View v) {
        onItemClickCallback.onItemClicked(v, position);
    }
    public interface OnItemClickCallback{
        void onItemClicked(View view, int position);
    }
}
