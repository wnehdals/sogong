package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus10_1 : Bus(), Parcelable {
   override var stationNames = arrayOf(
       "터미널",
       "삼척의료원",
       "성내치안센터",
       "상공회의소",
       "삼척고교",
       "향교앞",
       "코아루타워",
       "신동아아파트",
       "청솔아파트",
       "정라초교",
       "정상동주공아파트",
       "영진안",
       "정라동주민센터",
       "나릿골",
       "삼척이사부광장",
       "펠리스호텔"
   )
    override var id : String = "10-1"
    override var stationTimes = "삼척터미널출발시간 : 07:30, 08:30"
    override var departTimes = "정라진출발시간 : 07:50, 08:20"


}