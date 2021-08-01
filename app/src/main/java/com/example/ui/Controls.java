package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.R;

import java.util.Random;

public class Controls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controls);

        Button btnLog = findViewById(R.id.btnLog);
        TextView tvHello = findViewById(R.id.tvHello);
        EditText txtHello = findViewById(R.id.txtHello);
        CheckBox chkFb = findViewById(R.id.chkFb);
        RadioGroup radGender = findViewById(R.id.radGender);

        btnLog.setOnClickListener(v -> {
            tvHello.setText("Text changed: " + new Random().nextInt(100));
            String msg = "Edit text is: " + txtHello.getText().toString() + "\n"
                    + "ChkFb: " + chkFb.isChecked() + "\n"
                    + "Gender: " + (radGender.getCheckedRadioButtonId() == R.id.radMale ? "Male" : "Female");
            Toast.makeText(Controls.this, msg, Toast.LENGTH_SHORT).show();
        });
    }
}