package com.example.tirthnileshbhaipatel_individualproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Checkout extends AppCompatActivity {

    //RadioButton cardRButton;
    RadioGroup radioGroup;
    TextView textView,textView1,receiver_msg;
    EditText editNameOnCCard,editCCardNumber,editCExpiryDate,editCCvv;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout);

        button=(Button) findViewById(R.id.btnSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 openLast();
            }
        });

        radioGroup=(RadioGroup) findViewById(R.id.radioGroup);

        textView=(TextView)findViewById(R.id.textCView);
        textView1=(TextView) findViewById(R.id.textDView);
        editNameOnCCard=(EditText) findViewById(R.id.editNameOnCCard);
        editCCardNumber=(EditText) findViewById(R.id.editCCardNumber);
        editCExpiryDate=(EditText) findViewById(R.id.editCExpiryDate);
        editCCvv=(EditText) findViewById(R.id.editCCvv);



        textView.setVisibility(View.INVISIBLE);

        textView1.setVisibility(View.INVISIBLE);

        editNameOnCCard.setVisibility(View.INVISIBLE);


        editCCardNumber.setVisibility(View.INVISIBLE);


        editCExpiryDate.setVisibility(View.INVISIBLE);


        editCCvv.setVisibility(View.INVISIBLE);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i==R.id.rdBtnCreditCard)
                {

                   textView.setVisibility(View.VISIBLE);

                   textView1.setVisibility(View.INVISIBLE);

                    editNameOnCCard.setVisibility(View.VISIBLE);


                    editCCardNumber.setVisibility(View.VISIBLE);


                    editCExpiryDate.setVisibility(View.VISIBLE);


                    editCCvv.setVisibility(View.VISIBLE);

                }
                else if (i==R.id.rdBtnDebit)
                {
                    textView1.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.INVISIBLE);

                    editNameOnCCard.setVisibility(View.VISIBLE);


                    editCCardNumber.setVisibility(View.VISIBLE);


                    editCExpiryDate.setVisibility(View.VISIBLE);


                    editCCvv.setVisibility(View.VISIBLE);


                }
                else if (i==R.id.rdBtnCash)
                {
                    textView1.setVisibility(View.INVISIBLE);
                    textView.setVisibility(View.INVISIBLE);

                    editNameOnCCard.setVisibility(View.INVISIBLE);


                    editCCardNumber.setVisibility(View.INVISIBLE);


                    editCExpiryDate.setVisibility(View.INVISIBLE);


                    editCCvv.setVisibility(View.INVISIBLE);

                }
            }
        });

    }
    public void openLast(){
        Intent intent=new Intent(this,submitpage.class);
        startActivity(intent);

        Toast.makeText(this, "PAYMENT SUCCESSFUL", Toast.LENGTH_SHORT).show();
        Log.i("info", "PAYMENT SUCCESSFUL");
    }


}