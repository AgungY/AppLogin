package com.example.applogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dasboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasboard);

        CardView cardView = findViewById(R.id.CardV);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Menggunakan Intent untuk membuka aktivitas lain
                Intent intent = new Intent(MainActivity.this, CardView.class);
                startActivity(intent);
            }
        });
    }
}