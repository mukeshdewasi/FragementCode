package com.app.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.fragment.Fragment.FirstFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fragment =FirstFragment()

       var manager=supportFragmentManager
       var transacton=manager.beginTransaction()
       transacton.add(R.id.fragment_container ,fragment)
        transacton.commit()

    }
}