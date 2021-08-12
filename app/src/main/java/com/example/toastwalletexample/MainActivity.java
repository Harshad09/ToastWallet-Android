/** Created By Harshad Dabhade 5-jan-2021*/

package com.example.toastwalletexample;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.toastwallet.ToastWallet;
import com.google.android.material.datepicker.MaterialTextInputPicker;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastWallet.successRoundToast(MainActivity.this, "This is a Success Toast");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastWallet.errorRoundToast(MainActivity.this,"This is an Error Toast");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastWallet.infoRoundToast(MainActivity.this, "This is an Info Toast");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastWallet.warningRoundToast(MainActivity.this,"This is a Warning Toast");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastWallet.successSquareToast(MainActivity.this, "This is a Success Toast");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastWallet.errorSquareToast(MainActivity.this, "This is an Error Toast");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastWallet.infoSquareToast(MainActivity.this, "This is an Info Toast");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastWallet.warningSquareToast(MainActivity.this, "This is a Warning Toast");
            }
        });


    }
}