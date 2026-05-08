package com.daypulse.app.widget.engine

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import com.daypulse.app.data.model.CountdownEvent
import com.daypulse.app.data.model.WidgetStyle

object WidgetBitmapRenderer {
    fun render(context: Context, event: CountdownEvent, style: WidgetStyle, width: Int, height: Int): Bitmap {
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        
        // Background
        paint.color = Color.parseColor("#111118")
        val rect = RectF(0f, 0f, width.toFloat(), height.toFloat())
        canvas.drawRoundRect(rect, 32f, 32f, paint)

        // Progress Border
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 12f
        paint.color = Color.parseColor(event.colorHex)
        val progress = event.getProgress()
        canvas.drawArc(
            RectF(16f, 16f, width - 16f, height - 16f),
            -90f,
            360f * progress,
            false,
            paint
        )

        // Text
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        paint.textSize = 64f
        paint.textAlign = Paint.Align.CENTER
        canvas.drawText("${event.getDaysRemaining()}", width / 2f, height / 2f + 16f, paint)

        paint.textSize = 24f
        canvas.drawText("DAYS LEFT", width / 2f, height / 2f + 56f, paint)

        // Emoji
        paint.textSize = 48f
        canvas.drawText(event.emoji, width / 2f, height / 2f - 40f, paint)

        return bitmap
    }
}
