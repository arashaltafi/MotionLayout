package com.arash.altafi.motionlayout.sample1.carouselhelper

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Carousel
import com.arash.altafi.motionlayout.databinding.ActivityCarouselHelperBinding
import com.google.android.material.card.MaterialCardView

class CarouselHelperActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCarouselHelperBinding

    var colors = intArrayOf(
        Color.parseColor("#ffd54f"),
        Color.parseColor("#ffca28"),
        Color.parseColor("#ffc107"),
        Color.parseColor("#ffb300"),
        Color.parseColor("#ffa000"),
        Color.parseColor("#ff8f00"),
        Color.parseColor("#ff6f00"),
        Color.parseColor("#c43e00")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarouselHelperBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.apply {
            val numImages = colors.size
            carousel.setAdapter(object : Carousel.Adapter {
                override fun count(): Int {
                    return numImages
                }
                override fun populate(view: View, index: Int) {
                    if (view is MaterialCardView) {
                        view.setBackgroundColor(colors[index])
                    }
                }
                override fun onNewItem(index: Int) {
                }
            })
        }
    }

}