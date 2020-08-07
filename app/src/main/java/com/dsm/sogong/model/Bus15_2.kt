package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
class Bus15_2 : Bus(), Parcelable {
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
        "남초등학교후문",
        "적노동",
        "적노동",
        "죽서정",
        "조비1리",
        "조비동",
        "여삼리",
        "조비동",
        "조비1리",
        "죽서정",
        "적노동—남초등학교후문",
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
    override var id: String = "15-2"
    override var stationTimes = "삼척터미널 출발시간 : 07:10, 09:10, 11:40(조비), 15:30, 18:40(조비)"
    override var departTimes = "여삼 출발시간 : 07:40, 09:40, 12:00(조비), 16:00, 19:00(조비)"
}