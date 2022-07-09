package com.arash.altafi.motionlayout.sample1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.motionlayout.databinding.ActivitySample1Binding
import com.arash.altafi.motionlayout.sample1.carouselhelper.CarouselHelperActivity
import com.arash.altafi.motionlayout.sample1.circularcards.CircularCardsHomeActivity
import com.arash.altafi.motionlayout.sample1.democonstraintset.DemoConstraintSetActivity
import com.arash.altafi.motionlayout.sample1.examplekeyposition.PositionKeyExampleActivity
import com.arash.altafi.motionlayout.sample1.flow.FlowDemoActivity
import com.arash.altafi.motionlayout.sample1.horizontalcarousel.HorizontalCarouselActivity
import com.arash.altafi.motionlayout.sample1.menuselection.MenuSelectionCarouselActivity
import com.arash.altafi.motionlayout.sample1.modopay.ModoPaymentActivity
import com.arash.altafi.motionlayout.sample1.pillcards.PillCardsActivity
import com.arash.altafi.motionlayout.sample1.pivotrotation.FoodCircleTabsActivity
import com.arash.altafi.motionlayout.sample1.rotationcard.RotationCardHomeActivity
import com.arash.altafi.motionlayout.sample1.sampleskeycycle.KeyCycleSampleActivity
import com.arash.altafi.motionlayout.sample1.sensor.CardSensorActivity
import com.arash.altafi.motionlayout.sample1.starbucks.StarbucksDetailActivity
import com.arash.altafi.motionlayout.sample1.storiesinstagram.InstagramStoryHomeActivity
import com.arash.altafi.motionlayout.sample1.telegramheaderdemo.TelegramHeaderDemoActivity
import com.arash.altafi.motionlayout.sample1.testbutton.TestButtonActivity
import com.arash.altafi.motionlayout.sample1.verticalsnake.VerticalSnakeActivity
import com.arash.altafi.motionlayout.sample1.verticalstackcards.VerticalStackCardsHomeActivity

class Sample1Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySample1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySample1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.apply {
            circularCards.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, CircularCardsHomeActivity::class.java)
                )
            }
            rotationCardScenes.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, RotationCardHomeActivity::class.java)
                )
            }

            verticalCards.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, VerticalStackCardsHomeActivity::class.java)
                )
            }

            positionKeyExamples.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, PositionKeyExampleActivity::class.java)
                )
            }

            starbucks.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, StarbucksDetailActivity::class.java)
                )
            }

            sensorButton.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, CardSensorActivity::class.java)
                )
            }

            snakeCarousel.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, HorizontalCarouselActivity::class.java)
                )
            }

            pillCards.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, PillCardsActivity::class.java)
                )
            }

            demosConstraintSet.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, DemoConstraintSetActivity::class.java)
                )
            }

            flowDemo.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, FlowDemoActivity::class.java)
                )
            }

            telegramHeaderDemo.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, TelegramHeaderDemoActivity::class.java)
                )
            }

            pivotDemo.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, FoodCircleTabsActivity::class.java)
                )
            }

            carouselHelperActivity.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, CarouselHelperActivity::class.java)
                )
            }

            snakeActivity.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, VerticalSnakeActivity::class.java)
                )
            }

            modoPaymentActivity.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, ModoPaymentActivity::class.java)
                )
            }

            menuSelection.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, MenuSelectionCarouselActivity::class.java)
                )
            }

            keyCycleButton.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, KeyCycleSampleActivity::class.java)
                )
            }

            testButton.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, TestButtonActivity::class.java)
                )
            }

            instagramButton.setOnClickListener {
                startActivity(
                    Intent(this@Sample1Activity, InstagramStoryHomeActivity::class.java)
                )
            }
        }
    }

}