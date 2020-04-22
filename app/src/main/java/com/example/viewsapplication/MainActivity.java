package com.example.viewsapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent; // подключаем класс Intent
import android.view.View; // подключаем класс View для обработки нажатия кнопки
import android.widget.EditText; // подключаем класс EditText

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Метод обработки нажатия на кнопку
    public void sendMessage(View view) {
        // действия, совершаемые после нажатия на кнопку
        // Создаем объект Intent для вызова новой Activity
        Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
        // Получаем текстовое поле в текущей Activity
        EditText editText = (EditText) findViewById(R.id.edit_message);
        // Получае текст данного текстового поля
        String message = editText.getText().toString();
        // Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
        // второй параметр - значение этого объекта
        intent.putExtra(EXTRA_MESSAGE, message);
        // запуск activity
        startActivity(intent);
    }
    public void sendMessageActivity2 (View view){
        Intent intentActivity2 = new Intent(MainActivity.this,Activity2.class);
        startActivity(intentActivity2);
    }
    public void sendMessageActivity3 (View view){
        Intent intentActivity3 = new Intent(MainActivity.this,Activity3.class);
        startActivity(intentActivity3);
    }
    public void sendMessageActivityView (View view){
        Intent intentActivityView = new Intent(MainActivity.this,ActivityView.class);
        startActivity(intentActivityView);
    }
}
