package com.example.manageimg.ui.main

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.Exception

class PageViewModelFactory(val applicationContext:Context):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(PageViewModel::class.java)){
            return PageViewModel(applicationContext) as T
        }
        throw Exception("The PageViewModel Class is not found")
    }
}