package com.example.user.tests

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.changeText -> inputField.setText("Test text")
            R.id.switchActivity -> {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("input", inputField.text.toString())
                startActivity(intent)
            }
        }

    }
}
