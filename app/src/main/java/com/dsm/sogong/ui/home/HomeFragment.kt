package com.dsm.sogong.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.MediaController
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.dsm.sogong.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), View.OnClickListener{

    //private lateinit var homeViewModel: HomeViewModel
    lateinit var root: View
    var navController: NavController? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        root = inflater.inflate(R.layout.fragment_home, container, false)
        navController = activity?.let { Navigation.findNavController(it, R.id.nav_host_fragment) }
        val hairButton: Button = root.findViewById(R.id.hair_button)
        hairButton.setOnClickListener(this)
        val healthButton: Button = root.findViewById(R.id.health_button)
        healthButton.setOnClickListener(this)
        val busButton: Button = root.findViewById(R.id.bus_button)
        busButton.setOnClickListener(this)
        val childButton: Button = root.findViewById(R.id.child_button)
        childButton.setOnClickListener(this)
        //hair_button.setOnClickListener(this)
        //bus_button.setOnClickListener(this)
        //child_button.setOnClickListener(this)
        //health_button.setOnClickListener(this)
        return root
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.bus_button){
            navController?.navigate(R.id.action_navigation_home_to_navigation_bus)
        }
        if(v?.id == R.id.hair_button){
            Log.e("hair","hair")
            navController?.navigate(R.id.action_navigation_home_to_navigation_hair3)
        }
        if(v?.id == R.id.health_button){
            navController?.navigate(R.id.action_navigation_home_to_navigation_health)
        }
        if(v?.id == R.id.child_button){
            navController?.navigate(R.id.action_navigation_home_to_navigaion_child)
        }
    }
}
