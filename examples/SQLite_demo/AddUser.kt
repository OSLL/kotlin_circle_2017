package com.example.user.sqllitedemo

import android.content.ContentValues
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_user.*

class AddUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_user)

        var localDB = DBHandler(this)

        submit_btn.setOnClickListener{
            var tempName = username.text.toString()
            var tempSurName = usersurname.text.toString()

            var values = ContentValues()
            values.put(DBHandler.firstName, tempName)
            values.put(DBHandler.lastName, tempSurName)

            localDB.addUser(values)

            val intent = Intent(this, UserList::class.java)
            startActivity(intent)
        }
    }
}
