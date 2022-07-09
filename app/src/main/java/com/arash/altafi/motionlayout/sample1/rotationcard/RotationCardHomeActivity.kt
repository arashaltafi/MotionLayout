package com.arash.altafi.motionlayout.sample1.rotationcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.motionlayout.databinding.ActivityRotationCardHomeBinding
import com.arash.altafi.motionlayout.sample1.rotationcard.scenes.RotationCardScene1Activity

class RotationCardHomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRotationCardHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRotationCardHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.apply {
            demoRotationCard.setOnClickListener {
                startActivity(
                    Intent(this@RotationCardHomeActivity, RotationCardDemoActivity::class.java)
                )
            }
            rotationCardScene1.setOnClickListener {
                startActivity(
                    Intent(this@RotationCardHomeActivity, RotationCardScene1Activity::class.java)
                )
            }
        }
    }

}