package com.arash.altafi.motionlayout.sample1.pillcards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.lifecycle.ViewModelProviders
import com.arash.altafi.motionlayout.R
import com.arash.altafi.motionlayout.databinding.ActivityPillCardsBinding
import kotlinx.android.synthetic.main.activity_pill_cards.*

class PillCardsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPillCardsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPillCardsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        val viewModel = ViewModelProviders
            .of(this)
            .get(PillCardsViewModel::class.java)

        viewModel
            .modelStream
            .observe(this) {
                bindCard(it)
            }

        motionPillCards.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {}
            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {}
            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {}
            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                p0?.post {
                    when (p1) {
                        R.id.end -> {
                            p0.progress = 0f
                            viewModel.swipeRight()
                        }
                    }
                }
            }
        })
    }

    private fun bindCard(cards: PillCardModel?) {
        cards?.let {
            pillCard1.setCardBackgroundColor(cards.cardOne.backgroundColor)
            pillCard2.setCardBackgroundColor(cards.cardTwo.backgroundColor)
            pillCard3.setCardBackgroundColor(cards.cardThree.backgroundColor)
            pillCard4.setCardBackgroundColor(cards.cardFour.backgroundColor)
        }
    }
}