package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus10_3  : Bus(), Parcelable {
    override var stationNames = arrayOf(
        "삼척종합버스터미널",
        "현대정형외과",
        "홈플러스",
        "교동주민센터",
        "상공회의소",
        "현대상가",
        "삼척의료원",
        "남양동",
        "사직성당",
        "동양시멘트",
        "삼척역",
        "정라동주민센터",
        "나릿골",
        "삼척이사부광장",
        "펠리스호텔",
        "삼척이사부광장",
        "나릿골",
        "삼척정라우체국",
        "영진안",
        "정상주공아파트",
        "정라초교",
        "석미아파트",
        "삼척온천",
        "강부아파트",
        "코아루아파트",
        "코아루타워",
        "향교앞",
        "교동주민센터",
        "상공회의소",
        "현대상가",
        "삼척의료원",
        "삼척종합버스터미널"

    )
    override var id : String = "10-3"
    override var stationTimes = "삼척터미널 출발시간 : 09:30, 13:30, 15:30, 17:30, 18:30"
    override var departTimes = "정라진 출발시간 : 09:50, 13:50, 15:50, 17:50, 18:50"
}