package com.example.user.sqllitedemo

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper
import android.database.sqlite.SQLiteQueryBuilder

class DBHandler(context: Context) : SQLiteOpenHelper(context, DBName, null, DBVersion) {

    companion object {
        val DBName = "UsersDB" // Название БД
        val DBVersion = 1 // Версия БД
        val tableName = "userTable" // Название таблицы
        val _id = "id" // Столбец id
        val firstName = "fname" // Столбец fname
        val lastName = "lname" // Столбец lname
    }
    var sqlObj: SQLiteDatabase = this.writableDatabase // Сущность SQLiteDatabase

    override fun onCreate(p0: SQLiteDatabase?) { // Вызывается при генерации БД
        var sql1: String = "CREATE TABLE IF NOT EXISTS $tableName ( $_id  INTEGER PRIMARY KEY, $firstName TEXT, $lastName TEXT );"
        p0!!.execSQL(sql1);
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) { // Вызывается при обновлении версии БД
        p0!!.execSQL("Drop table IF EXISTS $tableName")
        onCreate(p0)
    }

    fun addUser(values: ContentValues) = sqlObj.insert(tableName, "", values)

    fun removeUser (id: Int) = sqlObj.delete(tableName, "id=?", arrayOf(id.toString()))

    fun updateUser(values: ContentValues, id: Int) = sqlObj.update(tableName, values, "id=?", arrayOf(id.toString()))

    fun listUsers(key : String) : ArrayList<UserData> {
        var arraylist = ArrayList<UserData>()
        var sqlQB = SQLiteQueryBuilder()
        sqlQB.tables = tableName
        var cols = arrayOf(_id, firstName, lastName)
        var selectArgs = arrayOf(key)
        var cursor = sqlQB.query(sqlObj, cols,"$firstName like ?", selectArgs,null,null, firstName)

        if (cursor.moveToFirst()) {
            do {
                val id = cursor.getInt(cursor.getColumnIndex(_id))
                val fname = cursor.getString(cursor.getColumnIndex(firstName))
                val lname = cursor.getString(cursor.getColumnIndex(lastName))

                arraylist.add(UserData(id, fname, lname))

            } while (cursor.moveToNext())
        }
        return arraylist
    }


}