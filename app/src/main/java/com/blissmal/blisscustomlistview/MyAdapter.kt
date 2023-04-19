package com.blissmal.blisscustomlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var mycontext: Context, var resources: Int, var items: List<Model>):ArrayAdapter<Model>(mycontext, resources, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mycontext)
        val view: View = layoutInflater.inflate(resources, null)

        val imageview: ImageView = view.findViewById(R.id.image)
        val titletextview: TextView = view.findViewById(R.id.Tv_maintext)
        val descriptiontextview: TextView = view.findViewById(R.id.Tv_subtext)

        var myitem:Model = items[position]
        imageview.setImageDrawable(mycontext.resources.getDrawable(myitem.image))
        titletextview.text = myitem.title
        descriptiontextview.text = myitem.description

        return view
    }
}