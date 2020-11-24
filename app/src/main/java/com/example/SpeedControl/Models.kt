package com.example.SpeedControl

import android.util.Log

abstract class Models(val vType : String, val isFlying: Boolean, val avgSpeed: Double) {
    val TAG = "Models"

    var isNowAt: String = ""

    constructor(vType: String, isFlying: Boolean, avgSpeed: Double, isNowAt: String) : this(vType, isFlying, avgSpeed) {
        this.isNowAt = isNowAt
    }

    init {
        Log.i(TAG, "Travelling by $vType at an average speed of $avgSpeed km/h.")
    }

    fun goto(destination: String) {
        val SpeedControlProvider: SpeedControlProvider = SpeedControlProvider()
        val speedcont = SpeedControlProvider.getDistance(isNowAt, destination)
        if (speedcont > 100 ) {
            Log.i(TAG, "goto: Sorry,You are expected from the police station \n")
        } else if (speedcont < 100 ) {
            Log.i(TAG, "goto: You can continue ")

        }
    }

    abstract fun getFuel()

    companion object{
        const val TAG = "Models"
    }

}