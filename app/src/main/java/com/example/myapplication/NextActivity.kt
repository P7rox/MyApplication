package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {

    lateinit var emp: Employee
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

//        var passed = intent.getStringExtra("key1")
        emp = intent.getSerializableExtra( "value1") as Employee
        displayMsg.text = "Name is ${emp.name} and loc is ${emp.loc}"
    }
}
