package com.example.user.coba1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val c:Calendar = Calendar.getInstance()
        val year: Int = c.get(Calendar.YEAR)
        val month: Int = c.get(Calendar.MONTH)
        val day: Int = c.get(Calendar.DAY_OF_MONTH)

        //* TAMPILKAN TANGGAL (dd/mm/yyyy) **//
        date.text = "$day/$month/$year"

        fun readData(): MutableList<ArrayModel>{
            val list = ArrayList<ArrayModel>()
            val teks: String = cari.text.toString()
            list.add(ArrayModel( rowId = 1, lokasi =  "ITATS", long =  "-7.289241", lat =  "112.778776"))
            list.add(ArrayModel( rowId = 2, lokasi =  "NAROTAMA", long =  "-7.288075", lat =  "112.776449"))
            for (n :ArrayModel in list){
                if (teks==n.lokasi){
                    longitude.setText(n.long)
                    latitude.setText(n.lat)
                    Toast.makeText(  this, "DATA DITEMUKAN", Toast.LENGTH_SHORT).show()
                }
            }
            return list
        }
        //**MEMINDAHKAN ACTIVITY MAP NAROTAMA **//
        btnnarotama.setOnClickListener {
        val maintomap = Intent(  this, MapsNarotama::class.java)
        startActivity(maintomap)
        }
        //**MEMINDAHKAN ACTIVITY MAP ITATS **//
        btnnarotama.setOnClickListener {
            val maintomap = Intent(  this, MapsItats::class.java)
            startActivity(maintomap) }
        }

}
