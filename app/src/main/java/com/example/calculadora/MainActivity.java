package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ope;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num0;
    Button suma;
    Button rest;
    Button mul;
    Button div;
    Button borraT;
    Button borraU;
    Button punto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        punto=findViewById(R.id.punto);
        borraT=findViewById(R.id.borrarT);
        borraU=findViewById(R.id.borrarU);
        ope=findViewById(R.id.text);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        num3=findViewById(R.id.num3);
        num4=findViewById(R.id.num4);
        num5=findViewById(R.id.num5);
        num6=findViewById(R.id.num6);
        num7=findViewById(R.id.num7);
        num8=findViewById(R.id.num8);
        num9=findViewById(R.id.num9);
        num0=findViewById(R.id.num0);
        suma=findViewById(R.id.suma);
        rest=findViewById(R.id.resta);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.divi);

        borraU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ope.getText().equals("")){}
                else{
                    ope.setText(ope.getText().toString().substring(0,ope.getText().length()-1));
                }
            }
        });
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    ope.setText(ope.getText()+".");
            }
        });
        borraT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText("");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "9");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "0");
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "+");
            }
        });
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "-");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "x");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ope.setText(ope.getText()+ "/");
            }
        });


    }

}