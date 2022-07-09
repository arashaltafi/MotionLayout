package com.arash.altafi.motionlayout.sample1.examplekeyposition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.motionlayout.databinding.ActivityPositionKeyExampleBinding

class PositionKeyExampleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPositionKeyExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPositionKeyExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.apply {
            keyPositionDelta.setOnClickListener {
                startActivity(
                    Intent(this@PositionKeyExampleActivity, KeyPositionDeltaActivity::class.java)
                )
            }

            keyPositionParent.setOnClickListener {
                startActivity(
                    Intent(this@PositionKeyExampleActivity, KeyPositionParentActivity::class.java)
                )
            }

            keyPositionPath.setOnClickListener {
                startActivity(
                    Intent(this@PositionKeyExampleActivity, KeyPositionPathActivity::class.java)
                )
            }
        }
    }

}