package com.daypulse.app.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.daypulse.app.data.model.CountdownEvent
import kotlinx.coroutines.flow.Flow

@Dao
interface CountdownEventDao {
    @Query("SELECT * FROM countdown_events ORDER BY targetTimestamp ASC")
    fun getAllEvents(): Flow<List<CountdownEvent>>

    @Query("SELECT * FROM countdown_events WHERE id = :id LIMIT 1")
    fun getEventById(id: String): Flow<CountdownEvent?>

    @Query("SELECT * FROM countdown_events WHERE id = :id LIMIT 1")
    suspend fun getEventByIdSync(id: String): CountdownEvent?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEvent(event: CountdownEvent)

    @Update
    suspend fun updateEvent(event: CountdownEvent)

    @Delete
    suspend fun deleteEvent(event: CountdownEvent)
}

@Dao
interface WidgetConfigDao {
    @Query("SELECT * FROM widget_configs WHERE widgetId = :widgetId LIMIT 1")
    suspend fun getConfig(widgetId: Int): WidgetConfig?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveConfig(config: WidgetConfig)

    @Query("DELETE FROM widget_configs WHERE widgetId = :widgetId")
    suspend fun deleteConfig(widgetId: Int)
}
