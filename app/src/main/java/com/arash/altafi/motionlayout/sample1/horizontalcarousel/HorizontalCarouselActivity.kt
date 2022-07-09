package com.arash.altafi.motionlayout.sample1.horizontalcarousel

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.helper.widget.Carousel
import com.arash.altafi.motionlayout.databinding.ActivityHorizontalCarouselBinding
import com.google.android.material.card.MaterialCardView

class HorizontalCarouselActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHorizontalCarouselBinding

    var colors = intArrayOf(
        Color.parseColor("#81d4fa"),
        Color.parseColor("#4fc3f7"),
        Color.parseColor("#29b6f6"),
        Color.parseColor("#03a9f4"),
        Color.parseColor("#039be5"),
        Color.parseColor("#0288d1"),
        Color.parseColor("#0277bd"),
        Color.parseColor("#01579b")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalCarouselBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.apply {
            val numImages = colors.size
            carouselSnake.setAdapter(object : Carousel.Adapter {
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