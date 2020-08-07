package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus10_2 : Bus(), Parcelable {
   override var stationNames = arrayOf(
       "삼척종합버스터미널",
       "삼척의료원",
       "성내치안센터",
       "상공회의소",
       "삼척고교",
       "향교앞",
       "코아루타워",
       "평생학습관.삼척세무서",
       "삼척온천",
       "석미아파트",
       "정라초교",
       "정상주공아파트",
       "영진안",
       "정라동주민센터",
       "나릿골",
       "삼척이사부광장",
       "펠리스호텔",
       "삼척이사부광장",
       "나릿골",
       "삼척정라우체국",
       "삼척역",
       "남양동",
       "사직성당",
       "남양동",
       "삼척여고",
       "한흥프라자",
       "삼척종합버스터미널"

   )
    override var id : String = "10-2"
    override var stationTimes = "삼척터미널 출발시간 : 07:40"
    override var departTimes = "정라진 출발시간 : 08:00"
}