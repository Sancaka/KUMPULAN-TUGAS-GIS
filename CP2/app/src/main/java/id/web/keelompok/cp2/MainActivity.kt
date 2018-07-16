package id.web.keelompok.cp2

import android.R.menu
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    internal lateinit var listView: ListView
    internal lateinit var adapter: ArrayAdapter<CharSequence>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.list) as ListView
        adapter = ArrayAdapter.createFromResource(this, R.array.list_jurusan, android.R.layout.simple_list_item_1)
        listView.adapter = adapter
        listView.onItemClickListener = this




    }



    override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        Toast.makeText(this, adapter.getItem(position), Toast.LENGTH_SHORT).show()
        val maintomap = Intent(this@MainActivity, Main2Activity::class.java )
        startActivity(maintomap)

    }
}