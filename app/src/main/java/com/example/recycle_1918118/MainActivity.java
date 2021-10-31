package com.example.recycle_1918118;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycle_1918118.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MhsList adapter;
    private ArrayList<Mhs> ctnArrayList;
    private ArrayList<Mhs> ctArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView) findViewById(R.id.recycleview);
        adapter = new MhsList(ctnArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        ctnArrayList = new ArrayList<>();
        ctnArrayList.add(new Mhs("Ronaldo", "1918466",
                "1999",R.drawable.ronaldo));
        ctnArrayList.add(new Mhs("Messi", "1918212",
                "1997",R.drawable.messi));
        ctnArrayList.add(new Mhs("Neymar", "1918721",
                "1989",R.drawable.neymar));
        ctnArrayList.add(new Mhs("Suarez", "191787",
                "2009",R.drawable.suarez));
    }


}

