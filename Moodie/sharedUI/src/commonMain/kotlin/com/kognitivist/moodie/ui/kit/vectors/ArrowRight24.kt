package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.ArrowRight24: ImageVector
    get() {
        if (_ArrowRight24 != null) {
            return _ArrowRight24!!
        }
        _ArrowRight24 = ImageVector.Builder(
            name = "ArrowRight24",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFEFC))) {
                moveTo(16.175f, 13f)
                horizontalLineTo(5f)
                curveTo(4.717f, 13f, 4.479f, 12.904f, 4.287f, 12.713f)
                curveTo(4.096f, 12.521f, 4f, 12.283f, 4f, 12f)
                curveTo(4f, 11.717f, 4.096f, 11.479f, 4.287f, 11.288f)
                curveTo(4.479f, 11.096f, 4.717f, 11f, 5f, 11f)
                horizontalLineTo(16.175f)
                lineTo(11.275f, 6.1f)
                curveTo(11.075f, 5.9f, 10.979f, 5.667f, 10.988f, 5.4f)
                curveTo(10.996f, 5.133f, 11.1f, 4.9f, 11.3f, 4.7f)
                curveTo(11.5f, 4.517f, 11.733f, 4.421f, 12f, 4.413f)
                curveTo(12.267f, 4.404f, 12.5f, 4.5f, 12.7f, 4.7f)
                lineTo(19.3f, 11.3f)
                curveTo(19.4f, 11.4f, 19.471f, 11.508f, 19.513f, 11.625f)
                curveTo(19.554f, 11.742f, 19.575f, 11.867f, 19.575f, 12f)
                curveTo(19.575f, 12.133f, 19.554f, 12.258f, 19.513f, 12.375f)
                curveTo(19.471f, 12.492f, 19.4f, 12.6f, 19.3f, 12.7f)
                lineTo(12.7f, 19.3f)
                curveTo(12.517f, 19.483f, 12.288f, 19.575f, 12.012f, 19.575f)
                curveTo(11.738f, 19.575f, 11.5f, 19.483f, 11.3f, 19.3f)
                curveTo(11.1f, 19.1f, 11f, 18.863f, 11f, 18.588f)
                curveTo(11f, 18.313f, 11.1f, 18.075f, 11.3f, 17.875f)
                lineTo(16.175f, 13f)
                close()
            }
        }.build()

        return _ArrowRight24!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRight24: ImageVector? = null
