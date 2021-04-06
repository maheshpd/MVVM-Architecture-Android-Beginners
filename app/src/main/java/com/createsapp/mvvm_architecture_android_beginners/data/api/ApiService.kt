package com.createsapp.mvvm_architecture_android_beginners.data.api

import com.createsapp.mvvm_architecture_android_beginners.data.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}