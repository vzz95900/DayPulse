package com.daypulse.app.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.daypulse.app.data.dao.CountdownEventDao
import com.daypulse.app.data.dao.WidgetConfigDao
import com.daypulse.app.data.model.CountdownEvent
import com.daypulse.app.data.model.WidgetConfig

@Database(entities = [CountdownEvent::class, WidgetConfig::class], version = 1, exportSchema = false)
abstract class DayPulseDatabase : RoomDatabase() {
    abstract fun countdownEventDao(): CountdownEventDao
    abstract fun widgetConfigDao(): WidgetConfigDao

    companion object {
        @Volatile
        private var INSTANCE: DayPulseDatabase? = null

        fun getDatabase(context: Context): DayPulseDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DayPulseDatabase::class.java,
                    "daypulse_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
