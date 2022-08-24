package com.example.tirthnileshbhaipatel_individualproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class products extends AppCompatActivity {
    private String product_name;
    private Integer product_image;
    private String product_price;
    private String product_description;



    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String name) {
        this.product_name = name;
    }

    public Integer getProduct_image() {
        return product_image;
    }
    public void setProduct_image(Integer image) {
        this.product_image = image;
    }

    public String getProduct_price() {
        return product_price;
    }
    public void setProduct_price(String price) {
        this.product_price = price;
    }

    public String getProduct_description() {
        return product_description;
    }
    public void setProduct_description(String description) { this.product_description = description; }



}
