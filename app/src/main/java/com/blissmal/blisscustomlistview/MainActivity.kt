package com.blissmal.blisscustomlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.listView)
        val mylist = mutableListOf<Model>()

        // lets add images, title and description
        mylist.add(Model("Mercedes", "This is a mercedes car worth it", R.drawable.mercedes))
        mylist.add(Model("Mercedes1", "This is a mercedes car worth it", R.drawable.mercedes1))
        mylist.add(Model("Toyota", "This is a Toyota car worth it", R.drawable.toyota))
        mylist.add(Model("Toyota1", "This is a Toyota1 car worth it", R.drawable.toyota1))
        mylist.add(Model("Hazard", "This is hazard from madrid", R.drawable.hazard))
        mylist.add(Model("Mbappe", "This is mbappe from psg", R.drawable.ps))
        mylist.add(Model("Bugatti", "This is a bugatti car worth it", R.drawable.bg))
        mylist.add(Model("Psg", "This is a psg squad worth it", R.drawable.index))

        listview.adapter = MyAdapter(this, R.layout.row, mylist)
    }
}