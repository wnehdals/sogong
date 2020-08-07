package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus11_1 : Bus(), Parcelable {
    override var stationNames = arrayOf(
        "삼척종합버스터미널",
        "삼척의료원",
        "성내치안센터",
        "상공회의소",
        "삼척고교",
        "향교앞",
        "종합운동장",
        "삼척해수욕장입구",
        "양지아파트앞",
        "갈천",
        "쏠비치",
        "증산",
        "쏠비치",
        "후진",
        "교동",
        "종합운동장",
        "현대아파트",
        "향교앞",
        "교동주민센터",
        "상공회의소",
        "현대상가",
        "삼척의료원",
        "삼척종합버스터미널"

    )
    override var id: String = "11-1"
    override var stationTimes = "삼척터미널 출발시간 : 07:20, 10:50, 13:30, 18:20"
    override var departTimes = "증산,후진 출발시간 : 07:35, 11:05, 13:45, 18:35"
}