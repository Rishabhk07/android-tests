package me.rishabhkhanna.tests

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.*;
import kotlinx.android.synthetic.main.activity_main.*

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCal.setOnClickListener ({
            tvFare.text = calcFare(etOne.text.toString().toFloat(),etTwo.text.toString().toInt()).toString()
        })
    }

    companion object {
        @JvmStatic
        fun calcFare(km: Float, time: Int): Float {
            return 50f + (if (km > 5) (km - 5) * 12 else 0f) + (if (time > 15) time - 15 else 0).toFloat()
        }
    }
}
