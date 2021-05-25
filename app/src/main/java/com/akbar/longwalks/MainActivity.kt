package com.akbar.longwalks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akbar.longwalks.adapter.CircleData
import com.akbar.longwalks.adapter.CircleViewAdapter
import com.akbar.longwalks.fragment.Home

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.initView()

    }

    private fun setFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout1, fragment)
        fragmentTransaction.commit()
    }
    private fun initView() {
        var home = Home()
        this.setFragment(home)
    }
}