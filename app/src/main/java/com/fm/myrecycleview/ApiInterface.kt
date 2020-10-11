package com.fm.myrecycleview

import retrofit2.Call
import retrofit2.http.GET
interface ApiInterface {
    @GET("photos")
    fun getPhotos(): Call < List < recyclerresponse >>
}