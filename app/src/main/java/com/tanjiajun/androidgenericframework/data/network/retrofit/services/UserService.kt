package com.tanjiajun.androidgenericframework.data.network.retrofit.services

import com.tanjiajun.androidgenericframework.data.model.request.LoginRequestData
import com.tanjiajun.androidgenericframework.data.model.response.UserInfoData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by TanJiaJun on 2019-07-30.
 */
interface UserService {

    @POST("user/v1/user/sign")
    fun login(@Body loginRequestData: LoginRequestData): Call<UserInfoData>

}