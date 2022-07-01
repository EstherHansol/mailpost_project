package com.example.mailbox.ui.home

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mailbox.Mail
import com.example.mailbox.MailsListAdapter
import com.example.mailbox.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    val MailList: List<Mail> = listOf(
        Mail("김현우", "첫 편지", "2022.07.01.", "To.친구"),
        Mail("홍길동", "안녕", "2022.07.01.", "To.친구2"),
        Mail("김현우1", "1편지", "2022.07.01.", "To.친구1")
    )

    val items = arrayOf("모두보기", "전애인", "반려동물", "기타")


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val homeViewModel =
//            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.tvTitle
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
//

        val myAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item,items)
        binding.spinner.adapter = myAdapter

        val adapter = MailsListAdapter(MailList)
        binding.mRecyclerView.adapter = adapter




        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}