package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.amplifyframework.core.Amplify
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Amplify.Predictions.translateText(
            "I like to eat spaghetti",
            { result -> Log.i("MyAmplifyApp", result.getTranslatedText()) },
            { error -> Log.e("MyAmplifyApp", "Translation failed", error) }
        )

        button.setOnClickListener{
            if((e1.text.toString()).equals("username") &&(e2.text.toString()).equals("password")) {
                tv.setTextColor(Color.parseColor("#00ff00"))
                tv.setText("Logged In")
            } else {
                tv.setTextColor(Color.parseColor("#ff0000"))
                tv.setText("Log In Failed")
            }
        }

        nextButton.setOnClickListener {
            var str = e1.text.toString()
            var myIntent = Intent(this, NextActivity::class.java)
            var emp = Employee(e1.text.toString(), e2.text.toString())
            myIntent.putExtra("value1", emp)
            startActivity(myIntent)
        }
    }
}
