package com.example.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int likes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button like = findViewById(R.id.like);
        Button dislike = findViewById(R.id.dislike);
        TextView textView = findViewById(R.id.likes);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                likes++;
                textView.setText(likes + " polubień");
            }
        });

        dislike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                likes--;
                textView.setText(likes + " polubień");
            }
        });
    }
}