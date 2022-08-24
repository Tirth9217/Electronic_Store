package com.example.tirthnileshbhaipatel_individualproject;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<products> mDataset;

    MyAdapter(ArrayList<products> productsList){
        mDataset = productsList;
    }
    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new MyViewHolder(layoutInflater, parent);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){
        holder.name.setText(mDataset.get(position).getProduct_name());
        holder.image.setImageResource(Integer.parseInt((String.valueOf(mDataset.get(position).getProduct_image()))));
        holder.price.setText(mDataset.get(position).getProduct_price());
        holder.description.setText(mDataset.get(position).getProduct_description());
       // holder.description.setOnClickListener(R.id.btnByNow);
    }

    @Override
    public int getItemCount(){
        return mDataset.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{


        TextView name,price, description;
        ImageView image;
       // Button button;



        MyViewHolder(LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.myproduct, parent, false));
            name = itemView.findViewById(R.id.txtProductName);
            image=itemView.findViewById(R.id.imageV1);
            price=itemView.findViewById(R.id.textPrice);
            description=itemView.findViewById(R.id.txtDescription);
            //button=itemView.findViewById(R.id.btnByNow);


        }
    }
}
