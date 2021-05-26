package com.akbar.longwalks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.akbar.longwalks.fragment.Home
import com.akbar.longwalks.fragment.Search

class MainActivity : AppCompatActivity() {

    lateinit var ftItem: ImageView
    lateinit var secItem: ImageView
    lateinit var thItem: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.initView()

        ftItem.setOnClickListener({
            var home = Home()
            this.setFragment(home)
        })

        secItem.setOnClickListener({
            val item = Search()
            this.setFragment(item)
        })

        thItem.setOnClickListener({
            val item = Search()
            this.setFragment(item)
        })

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

        this.ftItem = findViewById(R.id.firstItem)
        this.secItem = findViewById(R.id.secondItem)
        this.thItem = findViewById(R.id.thirdItem)
    }
}