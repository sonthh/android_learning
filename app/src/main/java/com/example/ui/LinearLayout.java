package com.example.ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.R;

public class LinearLayout extends AppCompatActivity {

    private Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        initUi();
        addEvents();
    }

    public void initUi() {
        btnShow = findViewById(R.id.btnShow);
    }

    public void addEvents() {
        btnShow.setOnClickListener(v -> Toast.makeText(LinearLayout.this, "Clicked button Show", Toast.LENGTH_SHORT).show());
    }

    public void clickButtonLog(View view) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
            .setTitle("Title")
            .setMessage("Message")
            .setPositiveButton("OK", (dialog, which) -> {
                Toast.makeText(LinearLayout.this, "Da Huy", Toast.LENGTH_SHORT).show();
                // finish(); // activity finish
                dialog.cancel();
            })
            .setNegativeButton("Huy", (dialog, which) -> {
                Toast.makeText(LinearLayout.this, "Da Huy", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }).create();
        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.show();
    }
}