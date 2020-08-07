package com.dsm.sogong

import com.google.gson.annotations.SerializedName

data class Child(
    @SerializedName("status") val status: String,
    @SerializedName("kinderInfo") val kinderInfo: ArrayList<Kinder>

)
data class Kinder(
    @SerializedName("key") val key: Int,
    @SerializedName("officeedu") val officeedu: String,
    @SerializedName("subofficeedu") val subofficeedu: String,
    @SerializedName("kindername") val kindername: String,
    @SerializedName("establish") val establish: String,
    @SerializedName("rppnname") val rppnname: String,
    @SerializedName("ldgrname") val ldgrname: String,
    @SerializedName("edate") val edate: String,
    @SerializedName("odate") val odate: String,
    @SerializedName("addr") val addr: String,
    @SerializedName("telno") val telno: String,
    @SerializedName("hpaddr") val hpaddr: String,
    @SerializedName("opertime") val opertime: String,
    @SerializedName("clcnt3") val clcnt3: String,
    @SerializedName("clcnt4") val clcnt4: String,
    @SerializedName("clcnt5") val clcnt5: String,
    @SerializedName("mixclcnt") val mixclcnt: String,
    @SerializedName("shclcnt") val shclcnt: String,
    @SerializedName(" ppcnt3") val  ppcnt3: String,
    @SerializedName("ppcnt4") val ppcnt4: String,
    @SerializedName("ppcnt5") val ppcnt5: String,
    @SerializedName("mixppcnt") val mixppcnt: String,
    @SerializedName("shppcnt") val shppcnt: String


)