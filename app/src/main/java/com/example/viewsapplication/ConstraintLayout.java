package com.example.viewsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent; // подключаем класс Intent
import android.view.Gravity;
import android.view.View; // подключаем класс View для обработки нажатия кнопки
import android.widget.EditText; // подключаем класс EditText

@SuppressLint("Registered")
public class ConstraintLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);
    }
    // Метод обработки нажатия на кнопку

    public void sendMessageActivityImage (View view){
        Intent intentActivityImage = new Intent(ConstraintLayout.this,ActivityImage.class);
        startActivity(intentActivityImage);
    }
}
