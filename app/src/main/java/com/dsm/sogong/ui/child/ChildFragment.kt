package com.dsm.sogong.ui.child

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.dsm.sogong.R
import com.dsm.sogong.network.ChildRetrofit
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_child.*


class ChildFragment : Fragment() {

    lateinit var root: View
    private var recyclerViewAdapter: RecyclerViewAdapter = RecyclerViewAdapter()
    private lateinit var recyclerView: RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        root = inflater.inflate(R.layout.fragment_child, container, false)
        recyclerView = root.findViewById(R.id.child_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = recyclerViewAdapter

        val apiKey = getText(R.string.childApiKey).toString()
        val disposal = ChildRetrofit().getRetrofit().getChildInfo(apiKey,42,42230)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
        disposal.subscribe{items ->recyclerViewAdapter.update(items.kinderInfo)}
        return root
    }


}
