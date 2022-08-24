package com.example.tirthnileshbhaipatel_individualproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class third extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    public ArrayList<products> productsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.myproduct_rec);



        products p1=new products();
        p1.setProduct_name("Samsung Fridge");
        p1.setProduct_image(R.drawable.samsung_fridge);
        p1.setProduct_price("PRICE - $1500");
        p1.setProduct_description("DETAILS-Samsung RF28R7551SG - RF28R7551SG/AC " +
                "French Door Refrigerator, 36 inch Width, ENERGY STAR Certified, 28.0 cu. ft. " +
                "Capacity, Thru Door Ice Dispenser, Exterior Water Dispenser, LED Lighting, " +
                "Fingerprint Resistant, Black Stainless Steel colour");

        products p2=new products();
        p2.setProduct_name("LG Fridge");
        p2.setProduct_image(R.drawable.lgrefrigerator);
        p2.setProduct_price("PRICE - $1500");
        p2.setProduct_description("DETAILS-LG LRFVS3006D French Door Refrigerator, " +
                "36 inch Width, ENERGY STAR Certified, 29.7 cu. ft. Capacity, Thru Door Ice Dispenser," +
                " Exterior Water Dispenser, LED Lighting, Fingerprint Resistant, Black Stainless Steel colour");



        productsList.add(p1);
        productsList.add(p2);


        recyclerView = findViewById(R.id.rView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new MyAdapter(productsList);
        recyclerView.setAdapter(mAdapter);

    }
    public void send(View view) {
        Intent intent = new Intent(third.this, Checkout.class);
        startActivity(intent);
    }
}