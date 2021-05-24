package com.akbar.longwalks.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.akbar.longwalks.R

data class CircleData(
    val name: String,
    val image: String
)

class CircleViewAdapter(private var data: List<CircleData>): RecyclerView.Adapter<CircleViewAdapter.CircleHolder>() {

    class CircleHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val title: TextView = view.findViewById(R.id.textView8)
        private val image: ImageView = view.findViewById(R.id.imageView7)
        fun bind(data: CircleData) {
            title.text = data.name

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CircleHolder {
        return CircleHolder(LayoutInflater.from(parent.context).inflate(R.layout.circle_item, parent, false))
    }

    override fun onBindViewHolder(holder: CircleHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size
}