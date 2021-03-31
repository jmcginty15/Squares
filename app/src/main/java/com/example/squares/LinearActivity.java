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

            }
        }


        colorButtons[0] = findViewById(R.id.linear1);
        colorButtons[1] = findViewById(R.id.linear2);
        colorButtons[2] = findViewById(R.id.linear3);
        colorButtons[3] = findViewById(R.id.linear4);
        colorButtons[4] = findViewById(R.id.linear5);
        colorButtons[5] = findViewById(R.id.linear6);
        colorButtons[6] = findViewById(R.id.linear7);
        colorButtons[7] = findViewById(R.id.linear8);
        colorButtons[8] = findViewById(R.id.linear9);
        colorButtons[9] = findViewById(R.id.linear10);
        colorButtons[10] = findViewById(R.id.linear11);
        colorButtons[11] = findViewById(R.id.linear12);
        colorButtons[12] = findViewById(R.id.linear13);
        colorButtons[13] = findViewById(R.id.linear14);
        colorButtons[14] = findViewById(R.id.linear15);
        colorButtons[15] = findViewById(R.id.linear16);
        colorButtons[16] = findViewById(R.id.linear17);
        colorButtons[17] = findViewById(R.id.linear18);
        colorButtons[18] = findViewById(R.id.linear19);
        colorButtons[19] = findViewById(R.id.linear20);
        colorButtons[20] = findViewById(R.id.linear21);
        colorButtons[21] = findViewById(R.id.linear22);
        colorButtons[22] = findViewById(R.id.linear23);
        colorButtons[23] = findViewById(R.id.linear24);
        colorButtons[24] = findViewById(R.id.linear25);

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
