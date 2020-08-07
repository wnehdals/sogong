package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus10 : Bus(), Parcelable {
    override var stationNames = arrayOf(
        "삼척종합버스터미널",
        "삼척의료원",
        "성내치안센터",
        "상공회의소",
        "삼척고",
        "향교앞",
        "이편한세상아파트",
        "지웰아파트",
        "코아루아파트",
        "신동아아파트",
        "정라초",
        "삼척보건소",
        "홈플러스",
        "교동주민센터",
        "상공회의소",
        "중앙시장",
        "죽서루",
        "원당동",
        "현대,한양아파트",
        "건지주공아파트",
        "중앙시장",
        "터미널"
    )
    override var id : String = "10"
    override var stationTimes = "삼척터미널출발시간 : 14:30, 16:30"
    override var departTimes = "정라진출발시간 : 14:40, 16:40"


}