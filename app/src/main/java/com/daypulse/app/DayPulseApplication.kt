package com.daypulse.app

import android.app.Application
import com.daypulse.app.di.AppModule

class DayPulseApplication : Application() {
    lateinit var appModule: AppModule
        private set

    override fun onCreate() {
        super.onCreate()
        appModule = AppModule(this)
    }
}
