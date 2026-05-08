package com.daypulse.app.data.database

import androidx.room.TypeConverter
import com.daypulse.app.data.model.WidgetStyle

class Converters {
    @TypeConverter
    fun toWidgetStyle(value: String): WidgetStyle {
        return try {
            enumValueOf<WidgetStyle>(value)
        } catch (e: Exception) {
            WidgetStyle.MINIMAL
        }
    }

    @TypeConverter
    fun fromWidgetStyle(value: WidgetStyle): String {
        return value.name
    }
}
