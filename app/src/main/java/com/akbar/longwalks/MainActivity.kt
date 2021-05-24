package com.akbar.longwalks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var rvCard: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listData = listOf(
            DataCardView(title = "Telenovela", name = "Tentang Cinta"),
            DataCardView(title = "Telenovela", name = "Tentang Cinta"),
            DataCardView(title = "Telenovela", name = "Tentang Cinta"),
            DataCardView(title = "Telenovela", name = "Tentang Cinta")
        )
        val cardAdapter = CardViewAdapter(listData)

        rvCard = findViewById(R.id.recyclerView)

        rvCard.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = cardAdapter
        }

    }
}