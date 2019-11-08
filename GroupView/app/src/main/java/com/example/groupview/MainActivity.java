package com.example.groupview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabMenu;
    FloatingActionButton fabAdd;
    FloatingActionButton fabEdit;
    Animation fabOpen, fabClose;
    RecyclerView rv;
    GroupAdapter adapter;
    boolean isFabOpen = true;
    List<Group> groupList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabMenu = (FloatingActionButton) findViewById(R.id.fabMenu);
        fabAdd = (FloatingActionButton) findViewById(R.id.fabAdd);
        fabEdit = (FloatingActionButton) findViewById(R.id.fabEdit);
        final LinearLayout addLayout = (LinearLayout) findViewById(R.id.add_linear);
        final LinearLayout editLayout = (LinearLayout) findViewById(R.id.edit_linear);


        fabMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addLayout.getVisibility() == View.VISIBLE &&
                        editLayout.getVisibility() == View.VISIBLE){

                    addLayout.setVisibility(View.GONE);
                    editLayout.setVisibility(View.GONE);
                }else {
                    addLayout.setVisibility(View.VISIBLE);
                    editLayout.setVisibility(View.VISIBLE);
                }
            }

        });


        groupList = new ArrayList<>();

        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));

        groupList.add(
                new Group(
                        "Java", "Public", 30, R.drawable.demo
                ));

        groupList.add(
                new Group(
                        "PHP", "Private", 5, R.drawable.demo
                ));

        groupList.add(
                new Group(
                        "Machine Learning", "Public", 15, R.drawable.demo
                ));

        groupList.add(
                new Group(
                        "Android", "Public", 100, R.drawable.demo
                ));

        groupList.add(
                new Group(
                        "React", "Public", 100, R.drawable.demo
                ));

        groupList.add(
                new Group(
                        "Graphic Design", "Public", 20, R.drawable.demo
                ));

        groupList.add(
                new Group(
                        "Big Data", "Private", 10, R.drawable.demo
                ));

        adapter = new GroupAdapter(this, groupList);
        rv.setAdapter(adapter);

    }
}
