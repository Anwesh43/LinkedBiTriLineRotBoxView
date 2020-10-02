package com.anwesh.uiprojects.frombottomtrilineview

/**
 * Created by anweshmishra on 02/10/20.
 */

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color
import android.app.Activity
import android.content.Context

val colors : Array<Int> = arrayOf(
        "#F44336",
        "#009688",
        "#3F51B5",
        "#4CAF50",
        "#2196F3"
).map({Color.parseColor(it)}).toTypedArray()
val parts : Int = 3
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val hFactor : Float = 4.2f
val backColor : Int = Color.parseColor("#BDBDBD")
val delay : Long = 20