package com.app.fragment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.fragment.R
import com.app.fragment.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        return binding.root
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //  var name =arguments?.getString("NAME")
        // var email=arguments?.getString("EMAIL")
        //var age=arguments?.getInt("AGE")

        arguments?.let {
            var name = it.getString("NAME")
            var email = it.getString("EMAIL")
            var age = it.getInt("AGE")
            binding.etResult.text = """
                name:$name
                email:$email
                age:$age
            """.trimIndent()
        }

    }

}




