package com.example.laba5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int clicks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View plusButtonView = findViewById(R.id.plus_button);
        View minusButtonView = findViewById(R.id.minus_button);
        TextView clicksText = findViewById(R.id.clicksText);
        Button plusButton =
                plusButtonView.findViewById(R.id.clickBtn);
        Button minusButton =
                minusButtonView.findViewById(R.id.clickBtn);
        plusButton.setText("+");
        minusButton.setText("-");
        plusButton.setOnClickListener(v -> {
            clicks++;
            clicksText.setText(clicks + " Clicks");
        });
        minusButton.setOnClickListener(v -> {
            clicks--;
            clicksText.setText(clicks + " Clicks");
        });
    }
}
