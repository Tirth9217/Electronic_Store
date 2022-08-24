package com.example.tirthnileshbhaipatel_individualproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class one extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    public ArrayList<products> productsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.myproduct_rec);



        products p1=new products();
        p1.setProduct_name("iphone 13");
        p1.setProduct_image(R.drawable.iphone_13);
        p1.setProduct_price("PRICE-$1500");
        p1.setProduct_description("DETAILS-The iPhone 13 and iPhone 13 Mini use an Apple-designed A15 Bionic system on a chip. " +
                "The iPhone 13 and 13 Mini feature a 6-core CPU, 4-core GPU and 16-core Neural Engine," +
                " while the iPhone 13 Pro and 13 Pro Max feature a 5 core GPU.");

        products p2=new products();
        p2.setProduct_name("Samsung Galaxy S22");
        p2.setProduct_image(R.drawable.galaxy_s22_ultra);
        p2.setProduct_price("PRICE-$1200");
        p2.setProduct_description("DETAILS-The S22 line comprises three models with various hardware specifications. " +
                "International models of the S22 utilize the Exynos 2200, while the U.S., Australian, Canadian," +
                " Chinese, Indian, Brazil and South-East Asian models utilize the Qualcomm Snapdragon 8 Gen 1.");


        products p3=new products();
        p3.setProduct_name("One Plus");
        p3.setProduct_image(R.drawable.oneplus);
        p3.setProduct_price("$800");
        p3.setProduct_description("DETAILS-The OnePlus 6T comes with a new 6.41-inch FHD+ AMOLED display & taller " +
                "19.5:9 aspect ratio (compared to the 6's shorter 6.28-inch, 19:9 panel) and increased screen-to-body" +
                " ratio (by about 2%, bringing it from almost 84% to around 86%) via the phone's slightly smaller");


        products p4=new products();
        p4.setProduct_name("Google Pixel 6 pro");
        p4.setProduct_image(R.drawable.googlepixel6pro);
        p4.setProduct_price("$1300");
        p4.setProduct_description("DETAILS-The Pixel 6 and Pixel 6 Pro both feature a unique new design " +
                "that is visually distinct from previous-generation Pixel phones, including a large camera bar " +
                "and two-tone color scheme on the back.[30] The front of both phones also feature a " +
                "centered hole-punch display notch.");


        products p5=new products();
        p5.setProduct_name("Samsung Galaxy S10");
        p5.setProduct_image(R.drawable.samsunggalaxys10);
        p5.setProduct_price("$1200");
        p5.setProduct_description("DETAILS-The S10 line comprises five models with various " +
                "hardware specifications; the main S10 and S10+ respectively feature 6.1 and 6.4-inch 1440p" +
                " \"Dynamic AMOLED\" displays with HDR10+ support and \"dynamic tone mapping\" technology.[12] " +
                "The displays have curved sides that slope over the horizontal edges of the device. ");



        productsList.add(p1);
        productsList.add(p2);
        productsList.add(p3);
        productsList.add(p4);
        productsList.add(p5);
        recyclerView = findViewById(R.id.rView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new MyAdapter(productsList);
        recyclerView.setAdapter(mAdapter);

    }
    public void send(View view) {
        Intent intent = new Intent(one.this, Checkout.class);
        startActivity(intent);
    }
}