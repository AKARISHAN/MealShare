package com.example.mealshare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView story = findViewById(R.id.imageView8);
        story.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity5.this, HomeActivity.class));
        });

        ImageView story1 = findViewById(R.id.imageView36);
        story1.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity5.this, HomeActivity.class));
        });
        ImageView story11 = findViewById(R.id.imageView12);
        story11.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity5.this, MainActivity5.class));
        });
        ImageView story111 = findViewById(R.id.imageView29);
        story111.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity5.this, DonActivity.class));
        });
    }
}