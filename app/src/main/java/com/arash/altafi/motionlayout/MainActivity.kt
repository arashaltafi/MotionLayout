package com.arash.altafi.motionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.motionlayout.databinding.ActivityMainBinding
import com.arash.altafi.motionlayout.sample1.Sample1Activity
import com.arash.altafi.motionlayout.sample2.Sample3Activity
import com.arash.altafi.motionlayout.sample3.Sample5Activity
import com.arash.altafi.motionlayout.sample4.Sample6Activity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.apply {
            btnSample1.setOnClickListener {
                startActivity(Intent(this@MainActivity, Sample1Activity::class.java))
            }
            btnSample2.setOnClickListener {
                startActivity(Intent(this@MainActivity, Sample3Activity::class.java))
            }
            btnSample3.setOnClickListener {
                startActivity(Intent(this@MainActivity, Sample5Activity::class.java))
            }
            btnSample4.setOnClickListener {
                startActivity(Intent(this@MainActivity, Sample6Activity::class.java))
            }
        }
    }

}