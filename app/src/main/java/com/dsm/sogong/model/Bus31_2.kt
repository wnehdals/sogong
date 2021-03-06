package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus31_2 : Bus(), Parcelable {
    override var stationNames = arrayOf(
        "삼척종합버스터미널",
        "현대정형외과",
        "홈플러스",
        "교동주민센터",
        "상공회의소",
        "현대상가",
        "죽서루",
        "성북삼거리",
        "원당동",
        "원당현대아파트",
        "서부초등학교앞",
        "자원동",
        "평전동",
        "운전학원",
        "도경교차로",
        "도경",
        "무사리",
        "미로면사무소",
        "미로역",
        "미로중학교",
        "하거노3리",
        "상거노2리—동산입구",
        "하정리",
        "상정",
        "천기삼거리",
        "천기",
        "활기리입구",
        "활기리",
        "활기리.두메농원",
        "활기리입구",
        "천기리",
        "천기삼거리",
        "상정리",
        "하정리",
        "동산입구",
        "상거노2리",
        "하거노3리",
        "미로중학교",
        "미로역",
        "미로면사무소",
        "무사리",
        "도경",
        "도경교차로앞",
        "등봉동",
        "평전동",
        "자원동",
        "한양아파트",
        "농산물품질관리원",
        "성북삼거리",
        "성내치안센터",
        "상공회의소",
        "삼척고교",
        "홈플러스",
        "삼척축협",
        "삼척종합버스터미널"

    )
    override var id: String = "31_2"
    override var stationTimes = "삼척터미널출발시간 : 6:40, 14:30"
    override var departTimes = "활기출발시간 : 7:10(동산경유), 15:00"
}