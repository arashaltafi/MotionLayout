package com.arash.altafi.motionlayout.sample1.storiesinstagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.motionlayout.R
import com.arash.altafi.motionlayout.databinding.ActivityInstagramStoryHomeBinding
import com.arash.altafi.motionlayout.sample1.storiesinstagram.scenes.InstagramStoryScene1Activity
import com.arash.altafi.motionlayout.sample1.storiesinstagram.scenes.InstagramStoryScene2Activity
import com.arash.altafi.motionlayout.sample1.storiesinstagram.scenes.InstagramStoryScene3Activity
import com.arash.altafi.motionlayout.sample1.storiesinstagram.scenes.InstagramStoryScene4Activity

class InstagramStoryHomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInstagramStoryHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram_story_home)
        binding = ActivityInstagramStoryHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()

    }

    private fun init() {
        binding.apply {
            demoInstagram.setOnClickListener {
                startActivity(
                    Intent(this@InstagramStoryHomeActivity, InstagramStoryDemoActivity::class.java)
                )
            }

            instagramStoryScene1.setOnClickListener {
                startActivity(
                    Intent(this@InstagramStoryHomeActivity, InstagramStoryScene1Activity::class.java)
                )
            }

            instagramStoryScene2.setOnClickListener {
                startActivity(
                    Intent(this@InstagramStoryHomeActivity, InstagramStoryScene2Activity::class.java)
                )
            }

            instagramStoryScene3.setOnClickListener {
                startActivity(
                    Intent(this@InstagramStoryHomeActivity, InstagramStoryScene3Activity::class.java)
                )
            }

            instagramStoryScene4.setOnClickListener {
                startActivity(
                    Intent(this@InstagramStoryHomeActivity, InstagramStoryScene4Activity::class.java)
                )
            }
        }
    }

}