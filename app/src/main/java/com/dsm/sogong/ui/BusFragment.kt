package com.dsm.sogong.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dongmin.scbus.model.Bus10

import com.dsm.sogong.R

class BusFragment : Fragment() {
    lateinit var root: View
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        root = inflater.inflate(R.layout.fragment_bus, container, false)
        return root
    }


}
