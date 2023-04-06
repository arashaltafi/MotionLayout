package com.arash.altafi.motionlayout.sample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.motionlayout.databinding.ActivitySample2Binding

class Sample2Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySample2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySample2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}