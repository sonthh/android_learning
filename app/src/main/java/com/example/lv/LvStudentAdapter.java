package com.example.lv;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import com.example.R;

public class LvStudentAdapter extends ArrayAdapter<Student> {
    Activity context;
    List<Student> students;
    int resource;

    public LvStudentAdapter(@NonNull Activity context, int resource, @NonNull List<Student> students) {
        super(context, resource, students);
        this.context = context;
        this.students = students;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(resource, null);
        TextView tv1 = convertView.findViewById(R.id.tv1);
        TextView tv2 = convertView.findViewById(R.id.tv2);
        Student student = students.get(position);
        tv1.setText("id: " + student.getId());
        tv2.setText(student.getName());
        return convertView;
    }
}
