package com.example.buttonexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.button) as Button // Получаем объект по id из R.java
        // Нотация дженериков <Button> - для новых версий Android API

        // Определяем Listener - метод, который будет вызван при нажатии на кнопку
        btnClickMe.setOnClickListener {
            val textBtnClicked = findViewById<TextView>(R.id.textView)
            textBtnClicked.setText("CLICKED") // Текстовые константы - нехорошо
        }
    }
}