package com.example.taxcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    TextView textView1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        textView1 = findViewById(R.id.textView1);
        button = findViewById(R.id.CalculateButton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String S1 = editText1.getText().toString();


                Float f1 = Float.parseFloat(S1);


                float bill = 0;



                if(f1<=300000)
                {
                    textView1.setText("yout tax is 0");
                }
                else if(f1<=400000)
                {
                    bill = (float) (5000 +(f1-300000) * 0.05);
                }
                else if(f1<=700000)
                {
                    bill = (float) (30000 +(f1-400000) * 0.1);
                }
                else if(f1<=1100000)
                {
                    bill = (float) (60000 +(f1-700000) * 0.15);
                }
                else if (f1<=1600000)
                {
                    bill = (float) (100000 +(f1-1100000) * 0.2);
                }

                bill = (float) (bill + bill*0.25);
                textView1.setText("your tax is "+bill);


            }
        });

    }
}