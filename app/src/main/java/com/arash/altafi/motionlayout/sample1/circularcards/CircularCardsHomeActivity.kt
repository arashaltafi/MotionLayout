package com.arash.altafi.motionlayout.sample1.circularcards

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.motionlayout.databinding.ActivityCircularCardsHomeBinding
import com.arash.altafi.motionlayout.sample1.circularcards.scenes.*

class CircularCardsHomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCircularCardsHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCircularCardsHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.apply {
            circularCardsDemo.setOnClickListener {
                startActivity(
                    Intent(this@CircularCardsHomeActivity, CircularCardsDemoActivity::class.java)
                )
            }

            circularCardsScene1.setOnClickListener {
                startActivity(
                    Intent(this@CircularCardsHomeActivity, CircularCardsScene1Activity::class.java)
                )
            }

            circularCardsScene2.setOnClickListener {
                startActivity(
                    Intent(this@CircularCardsHomeActivity, CircularCardsScene2Activity::class.java)
                )
            }

            circularCardsScene3.setOnClickListener {
                startActivity(
                    Intent(this@CircularCardsHomeActivity, CircularCardsScene3Activity::class.java)
                )
            }

            circularCardsScene4.setOnClickListener {
                startActivity(
                    Intent(this@CircularCardsHomeActivity, CircularCardsScene4Activity::class.java)
                )
            }

            circularCardsScene5.setOnClickListener {
                startActivity(
                    Intent(this@CircularCardsHomeActivity, CircularCardsScene5Activity::class.java)
                )
            }
        }
    }

}