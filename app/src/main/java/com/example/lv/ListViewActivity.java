package com.example.lv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private ListView lvNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvNum = findViewById(R.id.lvNum);

        // simple list view item
//        String arr[]=getResources().getStringArray(R.array.number);
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
//        lvNum.setAdapter(adapter);
//        lvNum.setOnItemClickListener((parent, view, position, id) -> {
//            TextView tv = (TextView) view;
//            String num = tv.getText().toString();
//            Toast.makeText(ListViewActivity.this, "Click: " + num + ", pos: " + position, Toast.LENGTH_SHORT).show();
//        });

        // custom lv item
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            students.add(new Student(i + "", "name " + i));
        }
        ArrayAdapter<Student> adapter = new LvStudentAdapter(this, R.layout.lv_item, students);
        lvNum.setAdapter(adapter);
    }
}