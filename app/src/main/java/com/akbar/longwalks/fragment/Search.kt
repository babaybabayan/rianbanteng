package com.akbar.longwalks.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akbar.longwalks.R
import com.akbar.longwalks.adapter.CircleMenuAdapter
import com.akbar.longwalks.adapter.MenuData

class Search : Fragment() {

    lateinit var rvCard: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cardOne = MenuCardOneFragment()
        val cardTwo = MenuCardOneFragment()
        setFragment(cardOne)
        setFragment2(cardTwo)
        this.initView(view)
    }

    private fun initView(view: View) {
        val listData = listOf(
            MenuData("sun", true),
            MenuData("mon", false),
            MenuData("tue", false),
            MenuData("wed", false),
            MenuData("thu", false),
            MenuData("fri", false),
            MenuData("sat", false)
        )

        rvCard = view.findViewById(R.id.circle_menu)

        val circleadapter = CircleMenuAdapter(listData)

        rvCard.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = circleadapter
        }
    }

    private fun setFragment(fragment: Fragment) {
        val fragmentManager = childFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.first_layout, fragment)
        fragmentTransaction.commit()
    }

    private fun setFragment2(fragment: Fragment) {
        val fragmentManager = childFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.second_layout, fragment)
        fragmentTransaction.commit()
    }

}