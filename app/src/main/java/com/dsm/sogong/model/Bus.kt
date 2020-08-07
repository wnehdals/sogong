package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
open class Bus() : Parcelable{
    open var stationNames = arrayOf("")
    open var id : String = "0"
    open var stationTimes = ""
    open var departTimes = ""
    open var etc=""
}