package com.adhithi.adhithimobiles.ui.allcategories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.adhithi.adhithimobiles.databinding.FragmentAllCategoriesBinding

class AllCategoriesFragment : Fragment() {

    private lateinit var allCategoriesViewModel: AllCategoriesViewModel
    private var _binding: FragmentAllCategoriesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        allCategoriesViewModel =
            ViewModelProvider(this).get(AllCategoriesViewModel::class.java)

        _binding = FragmentAllCategoriesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /*val textView: TextView = binding.textGallery
        allCategoriesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}