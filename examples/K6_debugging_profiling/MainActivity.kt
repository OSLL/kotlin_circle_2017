package com.example.user.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener {
            val limit = 10.0
            val value = 112321341234213523.0
            var temp = value
            while(temp > limit){
                temp = sqrt(temp / Math.atan(temp))
            }
        }
        button2.setOnClickListener {
            val array = Array(2000000){i -> i}
        }

    }
}
