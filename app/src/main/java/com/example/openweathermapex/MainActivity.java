package com.example.openweathermapex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class MainActivity extends AppCompatActivity {
    Button weatherButton;
    EditText cityText;
    TextView tempText, pressText, windText;
    OkHttpClient weatherClient;
    Request weatherRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherButton   = findViewById(R.id.weatherButton);
        cityText        = findViewById(R.id.city);
        tempText        = findViewById(R.id.temper);
        pressText       = findViewById(R.id.press);
        windText        = findViewById(R.id.wind);


    }
}
