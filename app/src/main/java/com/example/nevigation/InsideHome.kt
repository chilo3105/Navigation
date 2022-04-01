package com.example.nevigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nevigation.databinding.FragmentInsideHomeBinding


class InsideHome : Fragment() {
    private lateinit var binding: FragmentInsideHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInsideHomeBinding.inflate(layoutInflater)

        val argumentoRecibido = arguments?.getString("argumentoPasado")
        // Inflate the layout for this fragment

        binding.textView2.setText(argumentoRecibido)

        return binding.root
    }

}