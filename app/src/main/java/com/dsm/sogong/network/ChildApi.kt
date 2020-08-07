package com.dsm.sogong.network

import com.dsm.sogong.Child
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface ChildApi {
    @GET("basicInfo.do")
    fun getChildInfo(@Query("key") key: String,@Query("sidoCode") sidoCode: Int,@Query("sggCode") sggCode: Int) : Observable<Child>
}