package com.adhithi.adhithimobiles.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adhithi.adhithimobiles.R

class HomeAdapter(var context: Context): RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    companion object {
        @JvmField
        var dataList = emptyList<HomeDataModel>()
    }

    class ViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView) {
            var image: ImageView
            var title: TextView
            var description: TextView
            init {
                image = itemView.findViewById(R.id.image)
                title = itemView.findViewById(R.id.title)
                description = itemView.findViewById(R.id.description)
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.home_content, parent, false)
        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
        var data = dataList[position]
        holder.title.text = data.title
        holder.description.text = if (data.desc.length > 20) data.desc.subSequence(0, 20).toString()+".." else data.desc
        holder.image.setImageResource(data.image)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}