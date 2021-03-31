package com.example.squares;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button switchToLinearButton;
    Button[ ] colorButtons;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);

        constraintLayout = findViewById(R.id.constraintLayout);

        colorButtons = new Button[constraintLayout.getChildCount() - 1];
        for (int i = 0; i < constraintLayout.getChildCount() - 1; i++) {
            colorButtons[i] = (Button)constraintLayout.getChildAt(i);

            Random rand = new Random();
            int color = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            colorButtons[i].setBackgroundColor(color);
            colorButtons[i].setOnClickListener(v -> randomizeColors());
        }

        switchToLinearButton = findViewById(R.id.switchToLinear);
        switchToLinearButton.setOnClickListener(v -> navigateToLinearActivity());
    }

    private void navigateToLinearActivity() {
        Intent intent = new Intent(this, LinearActivity.class);
        startActivity(intent);
    }

    private void randomizeColors() {
        for (int i = 0; i < 25; i++) {
            Random rand = new Random();
            int color = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            colorButtons[i].setBackgroundColor(color);
        }
    }
}
