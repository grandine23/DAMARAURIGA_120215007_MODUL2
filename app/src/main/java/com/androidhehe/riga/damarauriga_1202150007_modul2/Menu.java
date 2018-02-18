package com.androidhehe.riga.damarauriga_1202150007_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            foods.add("pisa");
            foods.add("kepiting");
            foods.add("sate");
            foods.add("minum1");
            foods.add("minum2");

            priceses.add(32000);
            priceses.add(15000);
            priceses.add(25000);
            priceses.add(35000);
            priceses.add(17000);

            photos.add(R.drawable.pisa);
            photos.add(R.drawable.kepiting);
            photos.add(R.drawable.sate);
            photos.add(R.drawable.minum1);
            photos.add(R.drawable.minum2);
        }
    }
}
