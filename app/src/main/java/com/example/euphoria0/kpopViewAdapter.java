package com.example.euphoria0;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
public class kpopViewAdapter extends RecyclerView.Adapter<kpopViewAdapter.ViewHolder>{
    private String[] name;
    private int[] image;
    private String[] price;


    public kpopViewAdapter(String[] name, int[] image, String[] price){
        this.name = name;
        this.image = image;
        this.price = price;

    }
    @Override
    public kpopViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.cardimage,
                parent,
                false);

        return new kpopViewAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(kpopViewAdapter.ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.Kimage);
        Drawable dr1 = ContextCompat.getDrawable(cardView.getContext(), image[position]);
        imageView.setImageDrawable(dr1);
        TextView txt1 = (TextView)cardView.findViewById(R.id.KtxtName);
        txt1.setText(name[position]);
        TextView Pri = (TextView)cardView.findViewById(R.id.Ktxtprice);
        Pri.setText(price[position]);
        cardView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //
            }
        });
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }

    }
}
