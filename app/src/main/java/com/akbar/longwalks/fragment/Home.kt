package com.akbar.longwalks.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akbar.longwalks.CardViewAdapter
import com.akbar.longwalks.DataCardView
import com.akbar.longwalks.MainActivity
import com.akbar.longwalks.R
import com.akbar.longwalks.adapter.CircleData
import com.akbar.longwalks.adapter.CircleViewAdapter

/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home() : Fragment() {

    lateinit var rvCard: RecyclerView
    lateinit var rvCard2: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view)
    }

    private fun initView(selfview: View) {
        val listData = listOf(
            DataCardView(title = "Planning", name = "Trader", image = R.drawable.ic_card_image1),
            DataCardView(title = "Langit Biru", name = "Cinta", image = R.drawable.ic_card_image2),
            DataCardView(title = "Perencanaan", name = "Ilustratsi", image = R.drawable.ic_card_image3),
            DataCardView(title = "Ayat Ayat Cinta", name = "Cinta", image = R.drawable.ic_card_image4)
        )

        val circleDataList = listOf(
            CircleData(name = "Best Seller", image = R.drawable.ic_novel),
            CircleData(name = "Best Moment", image = R.drawable.ic_card_image3)
        )
        val cardAdapter = CardViewAdapter(listData)
        val circleAdapter = CircleViewAdapter(circleDataList)
        rvCard = selfview.findViewById(R.id.recyclerView)
        rvCard2 = selfview.findViewById(R.id.recyclerView2)
        rvCard.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = cardAdapter
        }

        rvCard2.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = circleAdapter
        }
    }
}