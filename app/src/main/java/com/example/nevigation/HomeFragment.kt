package com.example.nevigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.nevigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding = FragmentHomeBinding.inflate(inflater, container,  false)
        binding = FragmentHomeBinding.inflate(inflater)

        val navController = findNavController()


        //onclick
        binding.btnHomeToInside.setOnClickListener{
            // action_homeFragment_to_insideHome
            //navController.navigate(R.id.action_homeFragment_to_insideHome)
            val txtArgument = "Desde el home"
            val directions = HomeFragmentDirections.actionHomeFragmentToInsideHome(txtArgument)
            navController.navigate(directions)
        }


        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)
        return binding.root
    }


}