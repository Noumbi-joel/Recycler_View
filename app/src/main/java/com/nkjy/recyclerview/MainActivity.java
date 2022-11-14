package com.nkjy.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //Data
        DataModel[] myListData = new DataModel[]{
                new DataModel("Master Coding App", R.drawable.app1),
                new DataModel("Master Kotlin App", R.drawable.app2),
                new DataModel("Master Flutter App", R.drawable.app3),
                new DataModel("Master Coding App", R.drawable.app1),
                new DataModel("Master Kotlin App", R.drawable.app2),
                new DataModel("Master Flutter App", R.drawable.app3),
                new DataModel("Master Coding App", R.drawable.app1),
                new DataModel("Master Kotlin App", R.drawable.app2),
                new DataModel("Master Flutter App", R.drawable.app3),
        };

        //Adapter
        MyAdapter adapter = new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}