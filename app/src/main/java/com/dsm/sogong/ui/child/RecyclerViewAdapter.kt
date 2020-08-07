package com.dsm.sogong.ui.child

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dsm.sogong.Kinder
import com.dsm.sogong.R
import kotlinx.android.synthetic.main.item_chile_recyclerview.view.*

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.mViewHolder>() {

    private val githubRepos: ArrayList<Kinder> = ArrayList()

    inner class mViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.title
        var tel: TextView = itemView.tel
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): mViewHolder = mViewHolder(
        LayoutInflater.from(p0.context).inflate(R.layout.item_chile_recyclerview, p0, false))

    override fun onBindViewHolder(p0: mViewHolder, p1: Int) {
        p0.title.text = githubRepos[p1].kindername
        p0.tel.text = githubRepos[p1].telno
    }

    override fun getItemCount(): Int = githubRepos.size

    fun update(githubRepos: ArrayList<Kinder>) {
        this.githubRepos.clear()
        this.githubRepos.addAll(githubRepos)
        notifyDataSetChanged()
    }

}