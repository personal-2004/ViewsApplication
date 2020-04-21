package com.example.viewsapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Получаем сообщение из объекта intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Создаем текстовое поле
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText(message);

        // Устанавливаем текстовое поле в системе компоновки activity
        setContentView(textView);
    }
}
