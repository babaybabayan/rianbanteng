package com.akbar.longwalks.adapter

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.akbar.longwalks.R

data class MenuData(
    val title: String,
    val isSelected: Boolean
)

class CircleMenuAdapter(private var data: List<MenuData>): RecyclerView.Adapter<CircleMenuAdapter.CircleHolder>() {

    class CircleHolder(view: View): RecyclerView.ViewHolder(view) {
        private val title: TextView = view.findViewById(R.id.textView12)
        private val isSelectedView: ConstraintLayout = view.findViewById(R.id.contraint_circle)
        private val gradientDrawable = isSelectedView.background as GradientDrawable

        fun bind(data: MenuData) {
            title.text = data.title
            gradientDrawable.setStroke(2, if (data.isSelected) Color.BLACK else Color.WHITE)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CircleHolder {
        return CircleHolder(LayoutInflater.from(parent.context).inflate(R.layout.circle_menu_item, parent, false))
    }

    override fun onBindViewHolder(holder: CircleHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int  = data.size

}