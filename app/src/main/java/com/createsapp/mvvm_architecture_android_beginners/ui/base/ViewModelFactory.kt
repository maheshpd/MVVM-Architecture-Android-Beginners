package com.createsapp.mvvm_architecture_android_beginners.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.createsapp.mvvm_architecture_android_beginners.data.api.ApiHelper
import com.createsapp.mvvm_architecture_android_beginners.data.repository.MainRepository
import com.createsapp.mvvm_architecture_android_beginners.ui.main.viewmodel.MainViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory(private val apiHelper: ApiHelper): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }

        throw IllegalArgumentException("Unknown class name")
    }
}