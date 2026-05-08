package com.daypulse.app.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "countdown_events")
data class CountdownEvent(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val targetTimestamp: Long,
    val createdTimestamp: Long = System.currentTimeMillis(),
    val emoji: String,
    val colorHex: String,
    val isCompleted: Boolean = false
) {
    fun getProgress(): Float {
        val now = System.currentTimeMillis()
        if (now >= targetTimestamp) return 1f
        if (now <= createdTimestamp) return 0f
        
        val total = targetTimestamp - createdTimestamp
        val elapsed = now - createdTimestamp
        return (elapsed.toFloat() / total.toFloat()).coerceIn(0f, 1f)
    }

    fun getDaysRemaining(): Int {
        val now = System.currentTimeMillis()
        val diff = targetTimestamp - now
        return (diff / (1000 * 60 * 60 * 24)).toInt()
    }
}
