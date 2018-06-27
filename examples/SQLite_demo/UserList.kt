package com.example.user.sqllitedemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_user_list.*

class UserList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)
    }

    override fun onResume() {
        super.onResume()
        var localDB = DBHandler(this)
        var usrDataList = localDB.listUsers("%")
        if(usrDataList.size > 0) {
            var lazyData = ArrayList<String>()
            for (temp in usrDataList){
                lazyData.add(temp._id.toString() + temp.firstName + temp.lastName)
            }
            var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lazyData)
            userlist.adapter = adapter
        }

        add_new.setOnClickListener {
            val intent = Intent(this, AddUser::class.java)
            startActivity(intent)
        }
    }
}
