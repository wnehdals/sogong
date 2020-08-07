package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus21 : Bus(), Parcelable {
    override var stationNames = arrayOf(
        "삼척종합버스터미널",
        "현대정형외과",
        "홈플러스",
        "교동주민센터",
        "상공회의소",
        "현대상가",
        "삼척의료원",
        "터미널앞",
        "삼척병원",
        "동양아파트",
        "한국전력",
        "삼척교회",
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
        "동막",
        "내평",
        "토점",
        "양리",
        "신흥사입구.양리",
        "양리",
        "동막리",
        "반천교",
        "동막7리.반천",
        "신선마을주민교류센터",
        "대평—가들3교",
        "하마읍.가들마을",
        "하마읍",
        "수암",
        "하마읍",
        "하마읍",
        "중마읍리",
        "중마읍리",
        "중마읍",
        "상마읍리",
        "상마읍리",
        "상마읍",
        "상마읍.산주터"

    )
    override var id: String = "21"
    override var stationTimes = "삼척터미널출발시간 : 09:00(마읍,주지), 12:50(마읍), 15:30(주지,마읍)"
    override var departTimes = "상마읍출발시간 : 09:50, 14:00, 16:20"
}