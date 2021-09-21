package com.app_devs.fragmentslifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.app_devs.fragmentslifecycle.databinding.FragmentFirstBinding
import com.app_devs.fragmentslifecycle.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("SUMIT","onCreateView2")
        binding= FragmentSecondBinding.inflate(layoutInflater)
        binding.btnFrag2.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("SUMIT","onAttach2")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SUMIT","onCreate2")
    }

    override fun onStart() {
        super.onStart()
        Log.d("SUMIT","onStart2")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SUMIT","onResume2")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SUMIT","onPause2")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SUMIT","onStop2")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("SUMIT","onDestroyView2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SUMIT","onDestroy2")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("SUMIT","onDetach2")
    }

}