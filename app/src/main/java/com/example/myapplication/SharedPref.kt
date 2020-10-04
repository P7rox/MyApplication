package com.example.myapplication

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_shared_pref.*

class SharedPref : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_pref)
        sp = getSharedPreferences(filename, Context.MODE_PRIVATE)

        save.setOnClickListener {
            var editor: SharedPreferences.Editor = sp.edit()
            editor.putString(uname, editText.text.toString())
            editor.commit()
            editText.setText("")
        }

        load.setOnClickListener {
            var str: String = sp.getString(uname, "").toString()
//            var str: String = "hi"
            editText.setText(str.toString())
        }
    }

    companion object{
        lateinit var sp: SharedPreferences;
        var filename: String = "My_File"
        var uname: String = "Username"
    }
}
