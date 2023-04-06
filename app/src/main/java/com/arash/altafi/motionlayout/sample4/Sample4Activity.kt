package com.arash.altafi.motionlayout.sample4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import com.arash.altafi.motionlayout.R
import com.arash.altafi.motionlayout.databinding.ActivitySample4Binding

class Sample4Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySample4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySample4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.apply {
            motionLayout.addTransitionListener(object : MotionLayout.TransitionListener {
                override fun onTransitionStarted(
                    motionLayout: MotionLayout?,
                    startId: Int,
                    endId: Int
                ) {
                }

                override fun onTransitionChange(
                    motionLayout: MotionLayout?,
                    startId: Int,
                    endId: Int,
                    progress: Float
                ) {
                }

                override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                }

                override fun onTransitionTrigger(
                    motionLayout: MotionLayout?,
                    triggerId: Int,
                    positive: Boolean,
                    progress: Float
                ) {
                }
            })
            btnStartTransition.setOnClickListener {
                when (motionLayout.currentState) {
                    R.id.baseState -> motionLayout.transitionToState(R.id.halfState)
                    R.id.halfState -> motionLayout.transitionToState(R.id.endState)
                    R.id.endState -> motionLayout.transitionToState(R.id.baseState)
                }
            }
        }
    }

}