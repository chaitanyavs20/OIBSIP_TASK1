package com.example.chaitanya.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView output;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.textView2);
        input = findViewById(R.id.editTextNumber);
        Button btnGtoKG = findViewById(R.id.buttonGTOKG);
        Button btnKGtoG = findViewById(R.id.buttonKGTOG);
        Button btnKMtoM = findViewById(R.id.buttonKMTOM);
        Button btnMtoKM = findViewById(R.id.buttonMTOKM);

    }

    public void GTOKG(View view) {
        String number = input.getText().toString();
        int num = Integer.parseInt(number);
        float kilog = ((float)num / 1000);
        output.setText("Value in Kilograms: "+kilog);
    }

    public void KGTOG(View view) {
        String number = input.getText().toString();
        int num = Integer.parseInt(number);
        float grams = ((float)num * 1000);
        output.setText("Value in grams: "+grams);
    }

    public void KMTOM(View view) {
        String number = input.getText().toString();
        int num = Integer.parseInt(number);
        float meters = ((float)num * 1000);
        output.setText("Value in meters: "+meters);
    }

    public void MtoKM(View view) {
        String number = input.getText().toString();
        int num = Integer.parseInt(number);
        float kilom = ((float)num / 1000);
        output.setText("Value in meters: "+kilom);
    }
}