package com.akbar.longwalks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akbar.longwalks.adapter.CircleData
import com.akbar.longwalks.adapter.CircleViewAdapter

class MainActivity : AppCompatActivity() {

    lateinit var rvCard: RecyclerView
    lateinit var rvCard2: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listData = listOf(
            DataCardView(title = "Telenovela", name = "Tentang Cinta"),
            DataCardView(title = "Telenovela", name = "Tentang Cinta"),
            DataCardView(title = "Telenovela", name = "Tentang Cinta"),
            DataCardView(title = "Telenovela", name = "Tentang Cinta")
        )

        val circleDataList = listOf(CircleData(name = "Best Seller", image = "ic_longwalks.jpeg"))
        val cardAdapter = CardViewAdapter(listData)
        val circleAdapter = CircleViewAdapter(circleDataList)

        rvCard = findViewById(R.id.recyclerView)
        rvCard2 = findViewById(R.id.recyclerView2)

        rvCard.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = cardAdapter
        }

        rvCard2.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = circleAdapter
        }

    }
}