package com.example.SpeedControl

import android.util.Log

class Car ( vType : String, isFlying: Boolean, avgSpeed: Double): Models(vType , isFlying , avgSpeed) {
    override fun getFuel() {
        Log.i(TAG, "getFuel: You can continue")
    }


    companion object {
        const val TAG = "Car"


    }

}


