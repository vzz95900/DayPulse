package com.daypulse.app.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "widget_configs")
data class WidgetConfig(
    @PrimaryKey
    val widgetId: Int,
    val eventId: String,
    val style: WidgetStyle = WidgetStyle.MINIMAL,
    val showTitle: Boolean = true,
    val useDynamicColors: Boolean = false
)
