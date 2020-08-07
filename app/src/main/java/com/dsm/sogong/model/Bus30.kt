package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus30 : Bus(), Parcelable {
    override var stationNames = arrayOf(
        "삼척종합버스터미널",
        "현대정형외과",
        "홈플러스",
        "교동주민센터",
        "상공회의소",
        "현대상가",
        "죽서루",
        "성북삼거리",
        "현대아파트",
        "원당주공아파트",
        "삼척중학교",
        "자원동",
        "평전동",
        "운전학원",
        "도경",
        "무사리",
        "사둔1리",
        "사둔2리",
        "사둔리",
        "종전",
        "내미로리",
        "천은사",
        "내미로리",
        "조지전"


    )
    override var id: String = "30"
    override var stationTimes = "삼척터미널출발시간 : 08:40(조), 12:10(마평), 18:00"
    override var departTimes = "내미로출발시간 : 09:10(마평), 12:40(조), 18:30(조)"
}