package com.example.mealshare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView story12sq = findViewById(R.id.imageView28);
        story12sq.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity6.this, HomeActivity .class));
        });
        ImageView story1 = findViewById(R.id.imageView38);
        story1.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity6.this,MainActivity5.class));
        });
        ImageView story11 = findViewById(R.id.imageView37);
        story11.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity6.this, HomeActivity.class));
        });
        ImageView story111 = findViewById(R.id.imageView30);
        story111.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity6.this, DonActivity.class));
        });
    }
}