package com.daypulse.app.widget

import android.content.Context
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import com.daypulse.app.data.model.CountdownEvent

class DayPulseWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget
        get() = DayPulseWidget(
            CountdownEvent(
                title = "Launch Day",
                targetTimestamp = System.currentTimeMillis() + 86400000L * 5,
                emoji = "🚀",
                colorHex = "#6366F1"
            )
        )
}
