package com.daypulse.app.data.repository

import com.daypulse.app.data.dao.CountdownEventDao
import com.daypulse.app.data.model.CountdownEvent
import kotlinx.coroutines.flow.Flow

class EventRepository(private val dao: CountdownEventDao) {
    fun getAllEvents(): Flow<List<CountdownEvent>> = dao.getAllEvents()

    fun getEventById(id: String): Flow<CountdownEvent?> = dao.getEventById(id)

    suspend fun insertEvent(event: CountdownEvent) {
        dao.insertEvent(event)
    }

    suspend fun updateEvent(event: CountdownEvent) {
        dao.updateEvent(event)
    }

    suspend fun deleteEvent(event: CountdownEvent) {
        dao.deleteEvent(event)
    }
}
