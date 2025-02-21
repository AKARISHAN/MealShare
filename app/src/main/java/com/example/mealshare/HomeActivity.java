package com.example.mealshare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView Home = findViewById(R.id.home);
        Home.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this, HomeActivity.class));
        });
        ImageView cart = findViewById(R.id.cart);
        cart.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this, DonActivity.class));
        });
        ImageView loc = findViewById(R.id.loc);
        loc.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this, MyAddToCard.class));
        });
        ImageView pro = findViewById(R.id.profile);
        pro.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this, MainActivity5.class));
        });
        ImageView profile = findViewById(R.id.profile_picture);
        profile.setOnClickListener(view -> {
            startActivity(new Intent(HomeActivity.this, MainActivity5.class));
        });

        int[] visitplaces = {R.id.img1, R.id.img2, R.id.img3, R.id.img4,R.id.img5,R.id.img6,R.id.img7,R.id.img8};
        for (int id :visitplaces ) {
            ImageView donation = findViewById(id);
            if (donation != null) {
                donation.setOnClickListener(view -> {
                    Intent intent = new Intent(HomeActivity.this, DonActivity.class);
                    startActivity(intent);
                });
            }
        }

        int[] visitplaces1 = {R.id.li1, R.id.li2, R.id.li3, R.id.li4};
        for (int id :visitplaces1 ) {
            LinearLayout donation = findViewById(id);
            if (donation != null) {
                donation.setOnClickListener(view -> {
                    Intent intent = new Intent(HomeActivity.this, DonActivity.class);
                    startActivity(intent);
                });
            }
            Button story = findViewById(R.id.buttonReadMore1);
            story.setOnClickListener(view -> {
                startActivity(new Intent(HomeActivity.this, MainActivity4.class));
            });
            Button story1 = findViewById(R.id.buttonReadMore2);
            story1.setOnClickListener(view -> {
                startActivity(new Intent(HomeActivity.this, MainActivity4.class));
            });
            Button story1s = findViewById(R.id.buttonReadMore11);
            story1s.setOnClickListener(view -> {
                startActivity(new Intent(HomeActivity.this, MainActivity7 .class));
            });
            Button story12s = findViewById(R.id.buttonHelpUsImprove);
            story12s.setOnClickListener(view -> {
                startActivity(new Intent(HomeActivity.this, MainActivity8 .class));
            });
            Button story12sq = findViewById(R.id.buttonCollectPoints);
            story12sq.setOnClickListener(view -> {
                startActivity(new Intent(HomeActivity.this, MainActivity6 .class));
            });

        }

    }
}