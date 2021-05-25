package com.akbar.longwalks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class DataCardView (
    val name: String,
    val title: String,
    val image: Int
)

class CardViewAdapter(private var data: List<DataCardView>): RecyclerView.Adapter<CardViewAdapter.CardHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        return CardHolder(LayoutInflater.from(parent.context).inflate(R.layout.for_you_item_row, parent, false))
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        holder.bindHero(data[position])
    }

    override fun getItemCount(): Int = data.size

    class CardHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val title: TextView = view.findViewById(R.id.textView)
        private val desc: TextView = view.findViewById(R.id.textView7)
        private  val image: ImageView = view.findViewById(R.id.imageView6)
        fun bindHero(data: DataCardView) {
            title.text = data.title
            desc.text = data.name
            image.setImageResource(data.image)
        }
    }
}