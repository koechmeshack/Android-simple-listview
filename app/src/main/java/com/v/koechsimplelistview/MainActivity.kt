package com.v.koechsimplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mylistview=findViewById<ListView>(R.id.listview)
        val majina = arrayOf("uganda","Kenya","Tanzania","Thailand","Colombia","Burundi","L.A","Hawaii")
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,majina)
        mylistview.adapter=arrayAdapter
        mylistview.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this,"you have clicked on"+majina[position],Toast.LENGTH_LONG).show()
        }
    }
}