package com.example.SpeedControl
const val INVALID_ARG = -1
class SpeedControlProvider {
    val terminals : Array<String> = arrayOf("Bmw", " Mercedes " , " Audi" )
    val speedMatrix=arrayOf(arrayOf(0), arrayOf(0)

    )
    fun getDistance(origin: String, destination: String): Int {
        return if ( origin in terminals && destination in terminals )
            speedMatrix[terminals.indexOf(origin)][terminals.indexOf(destination)]
        else
            INVALID_ARG
    }
}