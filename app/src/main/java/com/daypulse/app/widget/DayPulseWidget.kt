package com.daypulse.app.widget

import android.content.Context
import androidx.glance.GlanceId
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.Image
import androidx.glance.ImageProvider
import androidx.glance.GlanceModifier
import androidx.glance.layout.fillMaxSize
import com.daypulse.app.widget.engine.WidgetBitmapRenderer
import com.daypulse.app.data.model.CountdownEvent
import com.daypulse.app.data.model.WidgetStyle

class DayPulseWidget(private val event: CountdownEvent) : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        val bitmap = WidgetBitmapRenderer.render(
            context = context,
            event = event,
            style = WidgetStyle.CIRCULAR,
            width = 400,
            height = 400
        )
        
        provideContent {
            Image(
                provider = ImageProvider(bitmap),
                contentDescription = "Countdown Widget",
                modifier = GlanceModifier.fillMaxSize()
            )
        }
    }
}
