package com.example.mealshare;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MealAdapter extends RecyclerView.Adapter<MealAdapter.MealViewHolder> {
    private List<Meal> mealList;
    private OnMealClickListener listener;

    public interface OnMealClickListener {
        void onAddToPlanClick(Meal meal);
    }

    public MealAdapter(List<Meal> mealList, OnMealClickListener listener) {
        this.mealList = mealList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MealViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meal_plan_item, parent, false);
        return new MealViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MealViewHolder holder, int position) {
        Meal meal = mealList.get(position);
        holder.mealName.setText(meal.getName());
        holder.mealDescription.setText(meal.getDescription());
        holder.mealCalories.setText(meal.getCalories());
        holder.mealType.setText(meal.getType());
        holder.mealImage.setImageResource(meal.getImageResource());

        holder.addToPlanButton.setOnClickListener(v -> listener.onAddToPlanClick(meal));
    }

    @Override
    public int getItemCount() {
        return mealList.size();
    }

    public static class MealViewHolder extends RecyclerView.ViewHolder {
        ImageView mealImage;
        TextView mealName, mealDescription, mealCalories, mealType;
        Button addToPlanButton;

        public MealViewHolder(@NonNull View itemView) {
            super(itemView);
            mealImage = itemView.findViewById(R.id.meal_image);
            mealName = itemView.findViewById(R.id.meal_name);
            mealDescription = itemView.findViewById(R.id.meal_description);
            mealCalories = itemView.findViewById(R.id.meal_calories);
            mealType = itemView.findViewById(R.id.meal_type);
            addToPlanButton = itemView.findViewById(R.id.add_to_plan_button);
        }
    }
}
