package com.espressosample.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.espressosample.databinding.FragmentEmptyBinding

class EmptyFragment : Fragment() {

    private var _binding: FragmentEmptyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEmptyBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGoSecond.setOnClickListener {
            findNavController().navigate(EmptyFragmentDirections.actionEmptyFragmentToSecondFragment())
        }

    }
}