package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText weight, height_ft, height_in;
        Button button;
        TextView result;


        weight = findViewById(R.id.edtWeight);
        height_ft = findViewById(R.id.edtHft);
        height_in = findViewById(R.id.edtHIn);
        button = findViewById(R.id.button);
        result = findViewById(R.id.result);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(weight.getText().toString());
                int hft = Integer.parseInt(height_ft.getText().toString());
                int hin = Integer.parseInt(height_in.getText().toString());

                int totalIn = hft * 12 +  hin;

                double totalCm = totalIn * 2.53;

                double totalM = totalCm / 100;

                double bmi = wt / (totalM * totalM);

                if(bmi>25){
                    result.setText("You're Over Weight");
                } else if (bmi<18) {
                    result.setText("You're Under Weight");
                }else {
                    result.setText("You're Healthy");
                }
            }
        });
    }
}