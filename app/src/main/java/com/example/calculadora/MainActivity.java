package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    Float num1;
    Float num2;
    String sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);

    }


    public void uno(View view) {
        if(tvResult.getText().toString().equals("0")){
            tvResult.setText("1");
        }else{
            tvResult.setText(tvResult.getText()+"1");
        }
    }

    public void dos(View view) {
        if(tvResult.getText().toString().equals("0")){
            tvResult.setText("2");
        }else{
            tvResult.setText(tvResult.getText()+"2");
        }
    }

    public void tres(View view) {
        if(tvResult.getText().toString().equals("0")){
            tvResult.setText("3");
        }else{
            tvResult.setText(tvResult.getText()+"3");
        }
    }

    public void cuatro(View view) {
        if(tvResult.getText().toString().equals("0")){
            tvResult.setText("4");
        }else{
            tvResult.setText(tvResult.getText()+"4");
        }
    }

    public void cinco(View view) {
        if(tvResult.getText().toString().equals("0")){
            tvResult.setText("5");
        }else{
            tvResult.setText(tvResult.getText()+"5");
        }
    }

    public void seis(View view) {
        if(tvResult.getText().toString().equals("0")){
            tvResult.setText("6");
        }else{
            tvResult.setText(tvResult.getText()+"6");
        }
    }

    public void siete(View view) {
        if(tvResult.getText().toString().equals("0")){
            tvResult.setText("7");
        }else{
            tvResult.setText(tvResult.getText()+"7");
        }
    }

    public void ocho(View view) {
        if(tvResult.getText().toString().equals("0")){
            tvResult.setText("8");
        }else{
            tvResult.setText(tvResult.getText()+"8");
        }
    }

    public void nueve(View view) {
        if(tvResult.getText().toString().equals("0")){
            tvResult.setText("9");
        }else{
            tvResult.setText(tvResult.getText()+"9");
        }
    }

    public void cero(View view) {
        if(tvResult.getText().toString().equals("0")){
            tvResult.setText("0");
        }else{
            tvResult.setText(tvResult.getText()+"0");
        }
    }

    public void suma(View view) {
        sign = "+";
        Guardarnum(view);
    }

    public void resta(View view) {
        sign = "-";
        Guardarnum(view);
    }

    public void multi(View view) {
        sign = "*";
        Guardarnum(view);
    }

    public void divi(View view) {
        sign = "/";
        Guardarnum(view);
    }

    public void igual(View view) {
        Float result;
        num2 = Float.parseFloat(tvResult.getText().toString());
        if (sign.equals("+")){
            result = num1 + num2;
            tvResult.setText(String.valueOf(result));
        }
        if (sign.equals("-")) {
            result = num1 - num2;
            tvResult.setText(String.valueOf(result));
        }
        if (sign.equals("*")) {
            result = num1 * num2;
            tvResult.setText(String.valueOf(result));
        }
        if (sign.equals("/")) {
            result = num1 / num2;
            tvResult.setText(String.valueOf(result));
        }




    }

    public void Clean(View view) {
        tvResult.setText("0");
        num1 = 0.0f;
        num2 = 0.0f;
        sign = "";
    }

    public void Guardarnum(View view){
        num1 = Float.parseFloat(tvResult.getText().toString());
        tvResult.setText("0");
    }


}