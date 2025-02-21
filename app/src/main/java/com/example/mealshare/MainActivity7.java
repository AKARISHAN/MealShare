package com.example.mealshare;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity7 extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MealAdapter mealAdapter;
    private List<Meal> mealList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView story1s = findViewById(R.id.imageView41);
        story1s.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity7.this, HomeActivity .class));
        });

        recyclerView = findViewById(R.id.recyclerMealPlans);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mealList = new ArrayList<>();
        mealList.add(new Meal("Salad Bowl", "Fresh veggies & dressing", "150 kcal", "Vegetarian", R.drawable.food2));
        mealList.add(new Meal("Grilled Chicken", "High protein meal", "300 kcal", "Non-Vegetarian", R.drawable.food1));
        mealList.add(new Meal("Fruit Smoothie", "Banana & berries", "200 kcal", "Vegan", R.drawable.food2));

        mealAdapter = new MealAdapter(mealList, meal ->
                Toast.makeText(MainActivity7.this, meal.getName() + " added to plan!", Toast.LENGTH_SHORT).show()
        );
        recyclerView.setAdapter(mealAdapter);
    }

}
