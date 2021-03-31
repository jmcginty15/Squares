package com.example.squares;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class LinearActivity extends AppCompatActivity {
    Button switchToConstraintButton;
    LinearLayout[ ] subLayouts;
    Button[ ] colorButtons;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        switchToConstraintButton = findViewById(R.id.switchToConstraint);
        switchToConstraintButton.setOnClickListener(v -> finish());

        colorButtons = new Button[25];

        linearLayout = findViewById(R.id.linearLayout);
        subLayouts = new LinearLayout[linearLayout.getChildCount() - 1];

        for (int i = 0; i < linearLayout.getChildCount() - 1; i++) {
            subLayouts[i] = (LinearLayout)linearLayout.getChildAt(i);

            for (int j = 0; j < subLayouts[i].getChildCount(); j++) {
                colorButtons[j + i * 5] = (Button)subLayouts[i].getChildAt(j);

                Random rand = new Random();
                int color = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                colorButtons[i].setBackgroundColor(color);
                colorButtons[i].setOnClickListener(v -> randomizeColors());
            }
        }

        for (int i = 0; i < 25; i++) {
            Random rand = new Random();
            int color = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            colorButtons[i].setBackgroundColor(color);
            colorButtons[i].setOnClickListener(v -> randomizeColors());
        }
    }

    private void randomizeColors() {
        for (int i = 0; i < 25; i++) {
            Random rand = new Random();
            int color = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            colorButtons[i].setBackgroundColor(color);
        }
    }
}
