package com.example.activityfirebash

import android.app.Application
import com.example.activityfirebash.dependenciesinjection.AppContainer
import com.example.activityfirebash.dependenciesinjection.MahasiswaContainer

class MahasiswaAplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container=MahasiswaContainer()
    }
}