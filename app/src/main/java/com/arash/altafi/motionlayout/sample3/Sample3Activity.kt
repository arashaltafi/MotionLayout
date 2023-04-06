package com.arash.altafi.motionlayout.sample3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.motionlayout.databinding.ActivitySample3Binding

class Sample3Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySample3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySample3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}