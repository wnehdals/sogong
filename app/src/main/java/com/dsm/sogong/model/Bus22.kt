package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus22 : Bus(), Parcelable {
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
        "오분리",
        "한재밑",
        "상맹방리",
        "맹방초등학교",
        "맹방주유소",
        "하맹방리",
        "근덕",
        "교가2리",
        "재동유원지",
        "호수식당",
        "새들가든",
        "광태리",
        "동막",
        "본동",
        "본동",
        "동막",
        "광태리",
        "새들가든",
        "호수식당—재동유원지",
        "근덕면사무소",
        "근덕농협하나로마트",
        "하맹방리",
        "상맹방2리.심방",
        "금계",
        "상맹방2리.심방",
        "맹방주유소",
        "맹방초등학교",
        "승공마을",
        "한재밑",
        "오분동",
        "사직삼거리",
        "삼척역",
        "남양동",
        "사직성당",
        "남양동",
        "삼척여고",
        "한흥프라자",
        "삼척의료원",
        "성내치안센터",
        "상공회의소",
        "삼척고교",
        "홈플러스",
        "삼척축협",
        "삼척종합버스터미널"

    )
    override var id: String = "22"
    override var stationTimes = "삼척터미널출발시간 : 10:30"
    override var departTimes = "금계출발시간 : 11:00"
}