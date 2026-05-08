package com.daypulse.app.di

import android.content.Context
import com.daypulse.app.data.database.DayPulseDatabase
import com.daypulse.app.data.repository.EventRepository

class AppModule(private val context: Context) {
    val database by lazy { DayPulseDatabase.getDatabase(context) }
    val eventRepository by lazy { EventRepository(database.countdownEventDao()) }
    val widgetConfigDao by lazy { database.widgetConfigDao() }
}
