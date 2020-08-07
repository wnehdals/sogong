package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus23 : Bus(), Parcelable {
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
        "농업기술센터",
        "덕산",
        "교가1리",
        "부남1리",
        "부남1리",
        "부남1리",
        "하늘안식의집",
        "부남2리",
        "부대앞",
        "대진",
        "신리",
        "동막2리.신리",
        "동막리",
        "궁촌",
        "궁촌",
        "궁촌초등학교",
        "궁촌2리.선흥",
        "매원1리",
        "양지",
        "양지",
        "궁촌3리.양지2반",
        "새마을",
        "구마",
        "새마을",
        "궁촌3리.양지2반",
        "양지",
        "양지",
        "매원1리",
        "궁촌2리.선흥",
        "궁촌초등학교",
        "궁촌",
        "궁촌",
        "동막리",
        "동막2리.신리",
        "신리",
        "대진",
        "부대앞",
        "부남2리",
        "하늘안식의집",
        "부남1리",
        "부남1리",
        "부남1리",
        "교가1리",
        "농업기술센터",
        "근덕농협하나로마트",
        "하맹방리",
        "맹방주유소",
        "맹방초등학교",
        "승공마을",
        "한재밑",
        "오분동",
        "사직삼거리",
        "삼척교회",
        "한국전력",
        "동양아파트",
        "삼척병원",
        "삼척의료원",
        "성내치안센터",
        "상공회의소",
        "삼척고교",
        "홈플러스",
        "삼척축협",
        "삼척종합버스터미널"


    )
    override var id: String = "23"
    override var stationTimes = "삼척터미널출발시간 : 07:00(대진 미경유), 09:50, 12:00, 14:30, 16:30"
    override var departTimes = "구마출발시간 : 07:40, 10:45, 12:55, 15:25, 17:25"
}