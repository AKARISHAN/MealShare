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

public class MyAddToCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_add_to_card);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button claimButton = findViewById(R.id.btn_claim_donation);
        claimButton.setOnClickListener(v -> {
            Intent intent = new Intent(MyAddToCard.this, DonationRequestActivity.class);
            startActivity(intent);
        });
        ImageView Home = findViewById(R.id.home);
        Home.setOnClickListener(view -> {
            startActivity(new Intent(MyAddToCard.this, HomeActivity.class));
        });
        ImageView cart = findViewById(R.id.cart);
        cart.setOnClickListener(view -> {
            startActivity(new Intent(MyAddToCard.this, DonActivity.class));
        });
        ImageView loc = findViewById(R.id.loc);
        loc.setOnClickListener(view -> {
            startActivity(new Intent(MyAddToCard.this, MyAddToCard.class));
        });
        ImageView pro = findViewById(R.id.profile);
        pro.setOnClickListener(view -> {
            startActivity(new Intent(MyAddToCard.this, MainActivity5.class));
        });
        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(view -> {
            startActivity(new Intent(MyAddToCard.this, HomeActivity.class));
        });


    }
}