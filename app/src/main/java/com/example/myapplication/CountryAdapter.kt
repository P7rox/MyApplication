package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.list_layout.view.*

class CountryAdapter ( var ctx: Context, var countries: MutableList<Country>): BaseAdapter() {

    override fun getCount(): Int {
        return countries.size
    }

    override fun getItem(p0: Int): Any {
        return countries[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var cview = LayoutInflater.from(ctx).inflate(R.layout.list_layout, null, false)
        cview.cflags.setImageResource(countries[p0].cflags)
        cview.cnames.text = countries[p0].cnames
        return cview
    }
}