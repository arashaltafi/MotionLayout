package com.arash.altafi.motionlayout.sample1.verticalstackcards

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.motionlayout.databinding.ActivityVerticalStackCardsHomeBinding
import com.arash.altafi.motionlayout.sample1.verticalstackcards.scenes.VerticalStackCardsScene1Activity
import com.arash.altafi.motionlayout.sample1.verticalstackcards.scenes.VerticalStackCardsScene2Activity
import com.arash.altafi.motionlayout.sample1.verticalstackcards.scenes.VerticalStackCardsScene3Activity

class VerticalStackCardsHomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVerticalStackCardsHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalStackCardsHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()


    }

    private fun init() {
        binding.apply {
            demo.setOnClickListener {
                startActivity(
                    Intent(this@VerticalStackCardsHomeActivity, VerticalStackCardsDemoActivity::class.java)
                )
            }

            verticalStackScene1.setOnClickListener {
                startActivity(
                    Intent(this@VerticalStackCardsHomeActivity, VerticalStackCardsScene1Activity::class.java)
                )
            }

            verticalStackScene2.setOnClickListener {
                startActivity(
                    Intent(this@VerticalStackCardsHomeActivity, VerticalStackCardsScene2Activity::class.java)
                )
            }

            verticalStackScene3.setOnClickListener {
                startActivity(
                    Intent(this@VerticalStackCardsHomeActivity, VerticalStackCardsScene3Activity::class.java)
                )
            }
        }
    }

}