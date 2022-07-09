package com.arash.altafi.motionlayout.sample1.democonstraintset

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.motionlayout.databinding.ActivityDemoConstraintSetBinding

class DemoConstraintSetActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDemoConstraintSetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDemoConstraintSetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.apply {
            btnCustomAttribute.setOnClickListener {
                startActivity(Intent(this@DemoConstraintSetActivity, CustomAttributeDemoActivity::class.java))
            }

            btnLayout.setOnClickListener {
                startActivity(Intent(this@DemoConstraintSetActivity, LayoutDemoActivity::class.java))
            }

            btnPropertySet.setOnClickListener {
                startActivity(Intent(this@DemoConstraintSetActivity, PropertySetDemoActivity::class.java))
            }

            btnTransform.setOnClickListener {
                startActivity(Intent(this@DemoConstraintSetActivity, TransformDemoActivity::class.java))
            }

            btnMotion.setOnClickListener {
                startActivity(Intent(this@DemoConstraintSetActivity, MotionDemoActivity::class.java))
            }
        }
    }

}