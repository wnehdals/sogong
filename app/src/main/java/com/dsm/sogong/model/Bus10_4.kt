package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus10_4  : Bus(), Parcelable {
    override var stationNames = arrayOf(
        "삼척종합버스터미널",
        "삼척의료원",
        "성내치안센터",
        "상공회의소",
        "삼척고교",
        "향교앞",
        "코아루타워",
        "신동아아파트",
        "청솔아파트",
        "정라초교",
        "정상주공아파트",
        "영진안",
        "정동주민센터",
        "나릿골",
        "삼척이사부광장",
        "펠리스호텔",
        "삼척이사부광장",
        "나릿골",
        "삼척정라우체국",
        "영진안",
        "정상주공아파트",
        "정라초교",
        "청솔아파트",
        "신동아아파트",
        "코아루타워",
        "향교앞",
        "교동주민센터",
        "상공회의소",
        "현대상가",
        "죽서루",
        "성북삼거리",
        "원당동",
        "원당현대아파트",
        "농산물품질관리원",
        "성북삼거리",
        "성내치안센터",
        "삼척축협",
        "삼척종합버스터미널"



    )
    override var id : String = "10-4"
    override var stationTimes = "삼척터미널 출발시간 : 09:00, 10:00, 11:00, 12:00, 13:00, 14:00, 15:00, 16:00, 17:00"
    override var departTimes = "펠리스호텔 출발시간 : 09:20, 10:20, 11:20, 12:20, 13:20, 14:20, 15:20, 16:20, 17:20"
}