package com.dongmin.scbus.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Bus32_2 : Bus(), Parcelable {
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
        "상천기리",
        "상천기리",
        "하반천",
        "상방천.한도골앞",
        "여삼입구",
        "고자리.아진골",
        "고자리",
        "하월산리",
        "개산.고봉암",
        "교곡1리.들입재",
        "교곡1리",
        "교곡1리.예비군훈련장",
        "근덕초.교곡분교",
        "교가6리.도원",
        "교가5리.무릉",
        "교가4리.옥계",
        "하맹방리",
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
    override var id: String = "32_2"
    override var stationTimes = "삼척터미널출발시간 : 13:20, 17:40"
    override var departTimes = "천기출발시간 : 14:10 , 18:20"
}