package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UC3 extends AppCompatActivity {
    int currentIndex = 0;
    ImageView[] imageViews = new ImageView[5];
    Handler handler = new Handler();
    Runnable updateImageTask = new Runnable() {
        @Override
        public void run() {
            for (ImageView imageView : imageViews) {
                imageView.setVisibility(View.GONE);
            }

            imageViews[currentIndex].setVisibility(View.VISIBLE);

            currentIndex = (currentIndex + 1) % imageViews.length;

            handler.postDelayed(this, 1000);
        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uc3);
        imageViews[0] = findViewById(R.id.imageView);
        imageViews[1] = findViewById(R.id.imageView2);
        imageViews[2] = findViewById(R.id.imageView4);
        imageViews[3] = findViewById(R.id.imageView5);
        imageViews[4] = findViewById(R.id.imageView6);
        handler.postDelayed(updateImageTask, 1000);
        Button back = findViewById(R.id.back3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UC3.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
