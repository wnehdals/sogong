package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus20_2 : Bus(), Parcelable {
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
        "교가4리.옥계",
        "교가5리.무릉",
        "교가6리.도원",
        "근덕초.교곡분교",
        "교곡1리.예비군훈련장"

    )
    override var id: String = "20-2"
    override var stationTimes = "삼척터미널출발시간 : 16:40"
    override var departTimes = "교곡출발시간 : 17:10"
}