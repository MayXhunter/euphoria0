package com.example.euphoria0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Animation top, buttom;
    private ImageView Kimg;
    private ImageView Aimg;
    private Button Kbtn;
    private Button Abtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        top = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        buttom = AnimationUtils.loadAnimation(this, R.anim.buttom_animation);

        Kimg = findViewById(R.id.Kimg);
        Aimg = findViewById(R.id.Aimg);

        Kimg.setAnimation(buttom);
        Kbtn.setAnimation(top);
        Abtn.setAnimation(buttom);
        Aimg.setAnimation(top);
        Kbtn = findViewById(R.id.Kbtn);
        Kbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,kpopActivity.class);
                startActivity(intent);
            }
        });
        Abtn = findViewById(R.id.Abtn);
        Abtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,animeActivity.class);
                startActivity(intent2);
            }
        });
    }
}