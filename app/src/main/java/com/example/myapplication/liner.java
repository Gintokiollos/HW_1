package com.example.myapplication;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import java.lang.reflect.Constructor;

public class liner extends AppCompatActivity {
    @Override
    
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liner);

        Button back = findViewById(R.id.back);
        Button Horizontal = findViewById(R.id.Horizontal_layout);
        Button Vertical = findViewById(R.id.Vertical_Layout);
        Button Left = findViewById(R.id.Align_Left);
        LinearLayout linearLayout = findViewById(R.id.linerlayout);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(liner.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Horizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setOrientation(LinearLayout.HORIZONTAL);

            }
        });
        Vertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setOrientation(LinearLayout.VERTICAL);
            }
        });
        Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setGravity(Gravity.LEFT);
            }
        });
    }
}
