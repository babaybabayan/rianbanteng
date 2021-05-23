package com.akbar.longwalks

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class dataCardView{
    var name: String = ""
    var title: String = ""
    var image: String = ""
}

class CardViewAdapter(private var data: List<dataCardView>, private var listener: (dataCardView) -> Unit): RecyclerView.Adapter<CardViewAdapter.ViewHolder>() {

    lateinit var contextAdapter: Context

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        contextAdapter = parent.context
        var inflateView = layoutInflater.inflate(R.layout.for_you_item_row, parent, false)
        return ViewHolder(inflateView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 1
    }
}