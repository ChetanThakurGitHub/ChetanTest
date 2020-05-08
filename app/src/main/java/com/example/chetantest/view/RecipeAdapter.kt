package com.emedinaa.kotlinmvvm.view

import Museum
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

import com.example.chetantest.DetailActivity
import com.example.chetantest.R

class RecipeAdapter(
    private var museums: List<Museum>,
    private var mContext: Context
) : RecyclerView.Adapter<RecipeAdapter.MViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_museum, parent, false)
        return MViewHolder(view)
    }

    override fun onBindViewHolder(vh: MViewHolder, position: Int) {
        val museum = museums[position]

        //render
        vh.textViewName.text = museum.title.toString().trim()
        vh.textViewName.setOnClickListener(View.OnClickListener {
            val intent = Intent(mContext, DetailActivity::class.java)
            intent.putExtra("data", museum)
            startActivity(mContext, intent, null)
        })
    }

    override fun getItemCount(): Int {
        return museums.size
    }

    fun update(data: List<Museum>) {
        museums = data
        notifyDataSetChanged()
    }

    class MViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewName: TextView = view.findViewById(R.id.itemTxt)
        //val imageView: ImageView = view.findViewById(R.id.imageView)
        //val textViewLink:TextView= view.findViewById(R.id.textViewLink)
    }
}