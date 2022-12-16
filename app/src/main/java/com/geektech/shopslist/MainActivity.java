package com.geektech.shopslist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView shopsRV;
    private ArrayList<String> shopsList = new ArrayList<>();
    private ShopsAdapter adapter = new ShopsAdapter(shopsList);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        shopsRV = findViewById(R.id.recycler_view);

        loadData();
        shopsRV.setAdapter(adapter);

    }
    private void loadData( ){
        shopsList.add("У Наргизы");
        shopsList.add("У Мухамеда");
        shopsList.add("У Артура");
        shopsList.add("У Максима");
        shopsList.add("У Мадины");
        shopsList.add("У Рахат");
        shopsList.add("Рандеву");
        shopsList.add("Глобус");
        shopsList.add("Кампа");
        shopsList.add("Технодом");
        shopsList.add("Народный");
        shopsList.add("У Нуртилека");
        shopsList.add("У Санжара");
    }
}