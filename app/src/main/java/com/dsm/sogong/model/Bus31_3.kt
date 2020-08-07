package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus31_3 : Bus(), Parcelable {
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
        "도경—무사리",
        "사둔1리",
        "미로면사무소",
        "미로역",
        "하거노4리",
        "상거노1리",
        "상거노2리",
        "동산입구",
        "동산리",
        "홍성터",
        "동산리",
        "동산입구",
        "상거노2리",
        "상거노1리",
        "하거노4리",
        "미로역",
        "미로면사무소",
        "사둔1리",
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
    override var id: String = "31_3"
    override var stationTimes = "삼척터미널출발시간 : 11:50, 17:00"
    override var departTimes = "동산출발시간 : 12:20, 17:30"
}