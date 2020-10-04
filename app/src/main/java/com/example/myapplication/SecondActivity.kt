package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    var data = arrayListOf<String>("India", "China", "US", "UK", "Mongolia", "Denmark", "Nepal")
    var list: MutableList<Country> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
//        var myadapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data)
//        countries.adapter = myadapter
//
//
//        countries.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
//            // Get the selected item text from ListView
//            val selectedItem = parent.getItemAtPosition(position) as String
//
//            // Display the selected item text on TextView
////            text_view.text = "Your favorite color: $selectedItem"
//        }

        list.add(Country(R.drawable.`in`,"India"));
        list.add(Country(R.drawable.ca,"Cannada"));
        list.add(Country(R.drawable.nz,"NewZeland"));
        list.add(Country(R.drawable.es,"Spain"));
        list.add(Country(R.drawable.mx,"Mexico"));
        list.add(Country(R.drawable.us,"USA"));
        list.add(Country(R.drawable.np,"Nepal"));

        var myCAdapter = CountryAdapter(this, list)

        world.adapter = myCAdapter
        world.setOnItemClickListener { parent, view, position, id ->
            var country: Country = world.getItemAtPosition(position) as Country

            Toast.makeText(applicationContext, country.cnames, Toast.LENGTH_LONG).show()
        }
    }
}
