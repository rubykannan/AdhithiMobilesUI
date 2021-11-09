package com.adhithi.adhithimobiles.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.adhithi.adhithimobiles.R
import com.adhithi.adhithimobiles.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var homeAdapter: HomeAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       /* homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root*/

        /*val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/

        var fragmentHomeView: View = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = fragmentHomeView.findViewById(R.id.home_recycler_view)
        var context: Context = requireContext();
        recyclerView.layoutManager = StaggeredGridLayoutManager(2,1)
        homeAdapter = HomeAdapter(context)
        recyclerView.adapter = homeAdapter
        val homeViewModel: HomeViewModel by viewModels()
        homeViewModel.homeDataList.observe(this, {dataList ->
            HomeAdapter.dataList = dataList
        })
        return fragmentHomeView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}