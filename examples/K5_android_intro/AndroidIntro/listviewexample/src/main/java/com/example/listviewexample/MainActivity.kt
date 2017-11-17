package com.example.listviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataArray = arrayOf( "Android", "IPhone", "Windows Phone", "BlackBerry")
        val listview = findViewById<ListView>(R.id.testlv) as ListView
        // Создаем адаптер
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataArray)
        //this - контекст
        // simple_list_item_1 - (список) TextView

        // Подключаем адаптер
        listview.setAdapter(adapter)
    }
}
