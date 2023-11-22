package com.arm.apk4;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button_toast, button_alert;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_toast = findViewById(R.id.btn_toast);
        button_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Button Toast Telah diKlik", Toast.LENGTH_SHORT).show();
            }
        });

        button_alert = findViewById(R.id.btn_alert);
        button_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Perintah untuk pindah halaman
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                Perintah Untuk menjalankannya
                startActivity(intent);
            }
        });
    }
}