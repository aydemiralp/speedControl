package com.example.SpeedControl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SpeedControl()
    }

    private fun SpeedControl()
    {
        val NormalCar = Car("normal car", false, 90.0)
        NormalCar.getFuel()

        val superSport = Bmw("super sport ",  false , 225.0, 4)
        superSport.getFuel()

    }
}