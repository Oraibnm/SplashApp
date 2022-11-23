package com.example.splashapp;

import java.util.List;

public interface IitemsData {
    List<String> getCategories ();
    List<Food> getItemsByCategory(String st);
}
