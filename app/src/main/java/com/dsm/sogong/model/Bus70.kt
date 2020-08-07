package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus70 : Bus(), Parcelable {
    override var stationNames = arrayOf(
        "삼척터미널",
    "삼척의료원",
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
    "사둔1리",
    "미로면사무소",
    "미로역",
    "미로중학교",
    "하거노3리",
    "상거노2리",
    "동산입구",
    "하정리",
    "상정",
    "천기삼거리",
    "천기",
    "천기.활기입구",
    "신기",
    "신곡초등학교",
    "신기",
    "안의리",
    "대평리",
    "상두벨",
    "마차리",
    "마차리.양지마을",
    "마차리역",
    "발리골입구",
    "발리공원",
    "고사리",
    "마교리",
    "우창주유소앞",
    "도계보건출장소",
    "도계버스터미널"

    )
    override var id: String = "70"
    override var stationTimes = "삼척터미널출발시간 : 9:40, 11:30, 13:40, 16:00"
    override var departTimes = "도계출발시간 : 9:40, 12:10, 12:30 (환선굴 경유), 15:40 (환선굴 경유)"

}