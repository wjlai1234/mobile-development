package com.example.practical3databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.practical3databindingdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val s = Student("Camden", "20")
        binding.student = s
     Log.i("xxxx",binding.student.toString())
     binding.root

        binding.btnUpdate.setOnClickListener {
            binding.apply {
                s.name = "ah lai"
                invalidateAll()

            }
        }
    }
}