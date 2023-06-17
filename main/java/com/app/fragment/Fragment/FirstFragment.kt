package com.app.fragment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.app.fragment.R
import com.app.fragment.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.etNext.setOnClickListener {

            var name=binding.etName.text.toString().trim()
            var email=binding.etEmail.text.toString().trim()
            var age=binding.etAge.text.toString().trim()

            var bundle = Bundle()
            bundle.putString("NAME",name)
            bundle.putString("EMAIL",email)
            bundle.putInt("AGE",age.toInt())
            var fragment =SecondFragment()

            fragment.arguments =bundle

            var manager=requireActivity().supportFragmentManager
            var transaction=manager.beginTransaction()
            transaction.replace(R.id.fragment_container ,fragment)
            transaction.commit()
        }


    }
}