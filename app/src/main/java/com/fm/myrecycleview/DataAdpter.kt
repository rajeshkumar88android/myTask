package com.fm.myrecycleview

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdpter(
    private
    var dataList: List<recyclerresponse>, private val context: Context
) : RecyclerView.Adapter<DataAdpter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.listcard, parent, false))
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataModel = dataList.get(position)
        holder.titleTextView.text = dataModel.title
        holder.title.text = dataModel.url
    }

    class ViewHolder(itemLayoutView: View) : RecyclerView.ViewHolder(itemLayoutView) {
        lateinit
        var titleTextView: TextView

        lateinit
        var title: TextView

        init {
            titleTextView = itemLayoutView.findViewById(R.id.name)
            title = itemLayoutView.findViewById(R.id.url)
        }
    }

    fun filterList(filteredNames: ArrayList<recyclerresponse>) {
        Log.e("list", filteredNames.toString())
        Log.e("list", filteredNames.size.toString())
        // this.dataList.clear()
        this.dataList = filteredNames
        notifyDataSetChanged()
    }
}