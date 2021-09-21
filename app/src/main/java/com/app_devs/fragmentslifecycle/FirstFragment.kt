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

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("SUMIT","onCreateView1")
        binding= FragmentFirstBinding.inflate(layoutInflater)
        binding.btnFrag1.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("SUMIT","onAttach1")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SUMIT","onCreate1")
    }

    override fun onStart() {
        super.onStart()
        Log.d("SUMIT","onStart1")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SUMIT","onResume1")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SUMIT","onPause1")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SUMIT","onStop1")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("SUMIT","onDestroyView1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SUMIT","onDestroy1")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("SUMIT","onDetach1")
    }
}