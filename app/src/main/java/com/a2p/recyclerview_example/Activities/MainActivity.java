package com.a2p.recyclerview_example.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.a2p.recyclerview_example.Adapters.AdapterMain;
import com.a2p.recyclerview_example.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> peliculas;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter myAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        myAdapter = new AdapterMain(peliculas);
        recyclerView.setAdapter(myAdapter);
    }

    public void init(){
        peliculas = new ArrayList<>();
        peliculas.add("El quinto elemento");
        peliculas.add("Jurasic Park");
        peliculas.add("El señor de los anillos");
        peliculas.add("Jumanji");
        peliculas.add("Los vengadores");
    }
}
