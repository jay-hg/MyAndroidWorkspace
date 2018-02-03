package com.fzu.starbuzz;

/**
 * Created by jay on 2018/1/28.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public static final Drink[] drinks = {
            new Drink("Late","A couple of espresso shotss with steamed milk",
                    R.drawable.latte),
            new Drink("Cappuccino","Espresso, hot milk, and a steamed milk foam",
                    R.drawable.cappuccino),
            new Drink("Filter","Highest quality beans roasted and brewed fresh",
                    R.drawable.filter),
    };

    public Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    @Override
    public String toString() {
        return name;
    }
}
