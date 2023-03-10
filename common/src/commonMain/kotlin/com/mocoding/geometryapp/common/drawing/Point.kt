package com.mocoding.geometryapp.common.drawing

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.unit.dp
import java.util.*

class Point(
    private val point: Offset,
    override val color: Color,
): Drawing {

    override fun drawOn(
        drawScope: DrawScope,
    ) {
        drawScope.drawCircle(
            color = color,
            radius = with(drawScope) { 6.dp.toPx() },
            center = point,
            style = Fill
        )
    }

}