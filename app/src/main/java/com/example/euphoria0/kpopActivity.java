package com.example.euphoria0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.euphoria0.module.anime;
import com.example.euphoria0.module.kpop;

public class kpopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kpop);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        RecyclerView recyclerK = findViewById(R.id.kpop_recycler);

        String[] names = new String[kpop.kpops.length];
        String[] price = new String[kpop.kpops.length];
        int[] imgs = new int[kpop.kpops.length];

        for(int i = 0; i<names.length;i++){
            names[i] = anime.animes[i].getName();
            price[i] = anime.animes[i].getName();
            imgs[i] = anime.animes[i].getImageId();
        }
        recyclerK.setLayoutManager(new GridLayoutManager(this,2));
        kpopViewAdapter adapterk = new kpopViewAdapter(names, imgs,price);
        recyclerK.setAdapter(adapterk);
    }
}