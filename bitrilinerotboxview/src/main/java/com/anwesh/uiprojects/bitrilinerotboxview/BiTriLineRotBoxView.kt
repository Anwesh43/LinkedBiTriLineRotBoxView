package com.anwesh.uiprojects.bitrilinerotboxview

/**
 * Created by anweshmishra on 01/10/20.
 */

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.RectF
import android.app.Activity
import android.content.Context

val colors : Array<Int> = arrayOf(
        "#F44336",
        "#4CAF50",
        "#2196F3",
        "#673AB7",
        "#FFC107"
).map({Color.parseColor(it)}).toTypedArray()
val parts : Int = 4
val scGap : Float = 0.02f
val sizeFactor : Float = 2.9f
val hFactor : Float = 3f
val backColor : Int = Color.parseColor("#BDBDBD")
val delay : Long = 20
val strokeFactor : Float = 90f
