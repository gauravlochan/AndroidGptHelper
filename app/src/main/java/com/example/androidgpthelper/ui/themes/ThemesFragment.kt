package com.example.androidgpthelper.ui.themes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidgpthelper.databinding.FragmentThemesBinding

class ThemesFragment : Fragment() {
    private var _binding: FragmentThemesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentThemesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.recyclerViewThemes.layoutManager = LinearLayoutManager(context)
        // TODO: Set up adapter and view model
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
} 