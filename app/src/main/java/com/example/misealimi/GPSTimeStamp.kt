package com.example.misealimi

import android.location.Location
import java.util.*

class GPSTimeStamp(location : Location){
    val theTime : Date
    val location : Location

    init{
        this.theTime = Date(location.time)
        this.location = location
    }
}