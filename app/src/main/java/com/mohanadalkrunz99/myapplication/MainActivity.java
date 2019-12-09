package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Student> studentList = new ArrayList<>();
    RecyclerView students_rv;
    StudentsAdapter studentsAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        students_rv = findViewById(R.id.students_rv);
        students_rv.setLayoutManager(new LinearLayoutManager(this));
        studentsAdapter = new StudentsAdapter(this ,studentList );
        students_rv.setAdapter(studentsAdapter);
    }

    private void initData() {
        studentList . add(new Student("1","Ahmad","4" , "98" , "CS"));
        studentList . add(new Student("2","Mohammed","4" , "98" , "SE"));
        studentList . add(new Student("3","Mahmoud","4" , "98" , "MIS"));



    }
}
