package com.example.sec1_menuapp.model;

import java.util.ArrayList;
import java.util.List;

public class DatabaseItems {

    private List<MenuItem> items = new ArrayList<>();

    public DatabaseItems(){
        items.add(new MenuItem("Burger", 20, "Sandwitches"));
        items.add(new MenuItem("Chicken Burger", 20, "Sandwitches"));
        items.add(new MenuItem("Coffee", 12, "Hot Drinks"));
        items.add(new MenuItem("Latte", 10, "Hot Drinks"));
        items.add(new MenuItem("Ice Tea", 13, "Cold Drinks"));

    }
    public String[] getCategories(){
        String[] cats = {"Sandwitches", "Hot Drinks", "Cold Drinks", "Pizzas"};
        return cats;
    }


}
