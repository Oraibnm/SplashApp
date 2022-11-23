package com.example.splashapp;

import com.example.splashapp.Food;
import com.example.splashapp.IitemsData;

import java.util.ArrayList;
import java.util.List;

public class ItemsData implements IitemsData {
    public List<Food> foodList;

    public ItemsData(){
        foodList= new ArrayList<>();
        foodList.add(new Food("test1 ", "cat1" , 20));
        foodList.add(new Food("test2 ", "cat1" , 30));
        foodList.add(new Food("test3 ", "cat1" , 50));
        foodList.add(new Food("test4 ", "cat1" , 10));
        foodList.add(new Food("test5 ", "cat1" , 60));
        foodList.add(new Food("test6", "cat1" , 80));



    }
    @Override
    public List<String> getCategories() {


        List<String> category = new ArrayList<>();
        category.add("Drinks");
        category.add("Fruit");
        category.add("Vegetables");
        category.add("Hot Drinks");
        return category;
    }

    @Override
    public List<Food> getItemsByCategory(String st) {
       List<Food> list = new ArrayList<>();
//        for (:
//             ) {
//
//        }
        return null;
    }
}
