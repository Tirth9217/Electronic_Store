package com.example.tirthnileshbhaipatel_individualproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class second extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    public ArrayList<products> productsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.myproduct_rec);



        products p1=new products();
        p1.setProduct_name("Samsung Series 7");
        p1.setProduct_image(R.drawable.samsungseries7tv);
        p1.setProduct_price("$1100");
        p1.setProduct_description("DETAILS-This is the figure close to what many market" +
                " researchers forecast for the year's worldwide 3D television sales (1.23 million units).[179]" +
                " It also debuted the 3D Home Theater (HT-C6950W) that allows the user to enjoy 3D image and " +
                "surround sound at the same time.");

        products p2=new products();
        p2.setProduct_name("Samsung Curve Tv");
        p2.setProduct_image(R.drawable.samsungseriescurvetv);
        p2.setProduct_price("$1400");
        p2.setProduct_description("DETAILS-Pur Color technology brings images to life in just the way nature intendedfor us to see them. The clear expression and abundance of true-to-life tones\n" +
                "will astound your eyes and excite your senses as it recreates more natural\n" +
                "and realistic colors onscreen.");



        productsList.add(p1);
        productsList.add(p2);


        recyclerView = findViewById(R.id.rView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new MyAdapter(productsList);
        recyclerView.setAdapter(mAdapter);

    }
    public void send(View view) {
        Intent intent = new Intent(second.this, Checkout.class);
        startActivity(intent);
    }
}