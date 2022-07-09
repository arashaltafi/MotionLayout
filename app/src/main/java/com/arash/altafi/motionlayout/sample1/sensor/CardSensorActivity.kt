package com.arash.altafi.motionlayout.sample1.sensor

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.arash.altafi.motionlayout.databinding.ActivityTestSensoresAndroidBinding

class CardSensorActivity : AppCompatActivity(), SensorEventListener {

    private var sensorManager: SensorManager? = null
    private var gravitySensor: Sensor? = null
    private lateinit var binding: ActivityTestSensoresAndroidBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestSensoresAndroidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

        sensorManager?.let { sensorManager ->
            gravitySensor = sensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY)
        }
    }

    override fun onResume() {
        super.onResume()
        gravitySensor?.also { gravity ->
            sensorManager?.registerListener(this, gravity, SensorManager.SENSOR_DELAY_GAME)
        }
    }

    override fun onPause() {
        super.onPause()
        sensorManager?.unregisterListener(this)
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }

    override fun onSensorChanged(event: SensorEvent?) {
        event?.let { sensorEvent ->
            binding.apply {
                val ejeZ = (sensorEvent.values[2] * 10) / 100
                if (ejeZ > 0 && ejeZ < 100) {
                    if (ejeZ > rotationCardMotionLayout.progress + 0.04) {
                        rotationCardMotionLayout.progress = ejeZ
                    }

                    if (ejeZ < rotationCardMotionLayout.progress - 0.04) {
                        rotationCardMotionLayout.progress = ejeZ
                    }
                }
            }
        }
    }

}