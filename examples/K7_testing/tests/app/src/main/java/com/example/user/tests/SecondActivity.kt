package com.example.user.tests


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val viewById = findViewById<View>(R.id.resultView) as TextView
        val inputData = intent.extras
        val input = inputData!!.getString("input")
        viewById.text = input
    }
}