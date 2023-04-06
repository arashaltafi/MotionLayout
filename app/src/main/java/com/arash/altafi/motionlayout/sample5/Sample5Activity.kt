package com.arash.altafi.motionlayout.sample5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.motionlayout.databinding.ActivitySample5Binding

class Sample5Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySample5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySample5Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}