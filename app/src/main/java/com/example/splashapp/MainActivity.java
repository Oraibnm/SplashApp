package com.example.splashapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.IInterface;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner sp;
    private ListView listView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.spinner);
        listView=findViewById(R.id.Lview);
        button = findViewById(R.id.button);

        IitemsData list = new ItemsData();
        List<String> cat = list.getCategories();
        ArrayAdapter<Food> foodArrayAdapter = new ArrayAdapter<Food>(this,
                android.R.layout.simple_list_item_1);
       // list.setAdapter(foodArrayAdapter);
    }

    //onClickListener

}