package com.example.horizontalrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Initialize Variable
    RecyclerView recyclerView;
    ArrayList<MainModel> mainModels;
    MainAdapter mainAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign VAriable
        recyclerView=findViewById(R.id.recycler_view);
        //Create int array
        Integer[] langLogo={R.drawable.thucan1,R.drawable.thucan2,R.drawable.thucan3,R.drawable.thucan4,R.drawable.thucan5,R.drawable.thucan6,R.drawable.thucan7,R.drawable.thucan8};

        //create string array
        String[] langName={"bánh bò","bánh bía","thịt lợn","thịt bò","thịt heo","thịt gà","thịt vịt","thịt thà"};
        //Initialize ArrayList
        mainModels=new ArrayList<>();
        for(int i=0;i<langLogo.length;i++){

            MainModel model=new MainModel(langLogo[i],langName[i]);
            mainModels.add(model);
        }
            //design horizontal layout
        LinearLayoutManager layoutManager=new LinearLayoutManager(
                MainActivity.this,LinearLayoutManager.HORIZONTAL,false
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        //initialize mainadapter
        mainAdapter = new MainAdapter(MainActivity.this,mainModels);
        //set MainAdapter to RecyclerView
        recyclerView.setAdapter(mainAdapter);
        //----------
        //Create int array

    }
    class  xxx extends AppCompatActivity{

    }
}