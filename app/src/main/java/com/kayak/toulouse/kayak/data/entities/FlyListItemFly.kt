package com.kayak.toulouse.kayak.data.entities

import java.util.*

class FlyListItemFly(val originDate: Date,
                          val originCity: String,
                          val destinationDate: Date,
                          val destinationCity: String)
{
    fun getFlyDuration() : Long{
        return destinationDate.time - originDate.time
    }

    fun getFlyLongerThanDay() : Int{
        return ((destinationDate.time - originDate.time) / 60*60*24).toInt()
    }
}