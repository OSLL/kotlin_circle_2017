package com.example.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() { //AppCompatActivity - базовый класс для всех Activity

    override fun onCreate(savedInstanceState: Bundle?) { // Вызывается при запуске Activity
        super.onCreate(savedInstanceState)
        //аргумент savedInstanceState: если Activity повторно инициализирована после остановки, Bundle хранит данные для восстановления
        setContentView(R.layout.activity_main) // Устанавливает Activity из layout-файла
        //аргумент R.layout.activity_main - id файла, автоматически генерируется в R.java
    }
}
// У приложений Android нет функции main(), нет одной точки входа.
// Основной вид компонентов приложений под Android — это Activity. Activity — это один «экран» приложения.
