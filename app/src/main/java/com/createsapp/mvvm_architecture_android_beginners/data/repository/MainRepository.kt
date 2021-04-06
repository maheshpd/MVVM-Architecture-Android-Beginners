package com.createsapp.mvvm_architecture_android_beginners.data.repository

import com.createsapp.mvvm_architecture_android_beginners.data.User
import com.createsapp.mvvm_architecture_android_beginners.data.api.ApiHelper
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>>{
        return apiHelper.getUsers()
    }
}