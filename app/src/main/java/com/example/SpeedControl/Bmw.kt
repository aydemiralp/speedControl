package com.example.SpeedControl

import android.util.Log

class Bmw (vType: String , isFlying : Boolean , avgSpeed: Double, numOfWheels: Int ): Models(vType , isFlying , avgSpeed ) {
    override fun getFuel() {
            Log.i(TAG, "getFuel: You got caught go to the nearest police station ")
        }


    companion object {
        const val TAG = "Bmw"
    }

}