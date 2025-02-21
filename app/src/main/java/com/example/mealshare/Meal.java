package com.example.mealshare;

public class Meal {
    private String name;
    private String description;
    private String calories;
    private String type;
    private int imageResource;

    public Meal(String name, String description, String calories, String type, int imageResource) {
        this.name = name;
        this.description = description;
        this.calories = calories;
        this.type = type;
        this.imageResource = imageResource;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getCalories() { return calories; }
    public String getType() { return type; }
    public int getImageResource() { return imageResource; }
}
