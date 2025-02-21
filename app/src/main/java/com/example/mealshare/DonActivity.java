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

public class DonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_don);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView story = findViewById(R.id.backButton);
        story.setOnClickListener(view -> {
            startActivity(new Intent(DonActivity.this, HomeActivity.class));
        });
        ImageView Home = findViewById(R.id.home);
        Home.setOnClickListener(view -> {
            startActivity(new Intent(DonActivity.this, HomeActivity.class));
        });
        ImageView cart = findViewById(R.id.cart);
        cart.setOnClickListener(view -> {
            startActivity(new Intent(DonActivity.this, DonActivity.class));
        });
        ImageView loc = findViewById(R.id.loc);
        loc.setOnClickListener(view -> {
            startActivity(new Intent(DonActivity.this, MyAddToCard.class));
        });
        ImageView pro = findViewById(R.id.profile);
        pro.setOnClickListener(view -> {
            startActivity(new Intent(DonActivity.this, MainActivity5.class));
        });
        Button back = findViewById(R.id.claimDonationBtn);
        back.setOnClickListener(view -> {
            startActivity(new Intent(DonActivity.this, MyAddToCard.class));
        });

    }
}