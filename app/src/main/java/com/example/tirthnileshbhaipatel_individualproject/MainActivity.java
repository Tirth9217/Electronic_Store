package com.example.tirthnileshbhaipatel_individualproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public CardView card1, card2, card3;
//    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_main);
//        setContentView(R.layout.checkout);

    card1=(CardView) findViewById(R.id.card1);
    card2=(CardView) findViewById(R.id.card2);
    card3=(CardView) findViewById(R.id.card3);
//    btn=(Button)findViewById(R.id.btnByNow);


    card1.setOnClickListener(this);
    card2.setOnClickListener(this);
    card3.setOnClickListener(this);
//    btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
            Intent i;
            switch(view.getId()){
                case R.id.card1:
                    i=new Intent(this,one.class);
                    startActivity(i);
                    break;

                case R.id.card2:
                    i=new Intent(this,second.class);
                    startActivity(i);
                    break;

                case R.id.card3:
                    i=new Intent(this,third.class);
                    startActivity(i);
                    break;

            }

    }




}