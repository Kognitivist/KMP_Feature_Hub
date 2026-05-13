package com.kognitivist.data.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.SelectedHome: ImageVector
    get() {
        if (_SelectedHome != null) {
            return _SelectedHome!!
        }
        _SelectedHome = ImageVector.Builder(
            name = "SelectedHome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFFB24F9C))) {
                moveTo(4f, 19f)
                verticalLineTo(10f)
                curveTo(4f, 9.683f, 4.071f, 9.383f, 4.213f, 9.1f)
                curveTo(4.354f, 8.817f, 4.55f, 8.583f, 4.8f, 8.4f)
                lineTo(10.8f, 3.9f)
                curveTo(11.15f, 3.633f, 11.55f, 3.5f, 12f, 3.5f)
                curveTo(12.45f, 3.5f, 12.85f, 3.633f, 13.2f, 3.9f)
                lineTo(19.2f, 8.4f)
                curveTo(19.45f, 8.583f, 19.646f, 8.817f, 19.788f, 9.1f)
                curveTo(19.929f, 9.383f, 20f, 9.683f, 20f, 10f)
                verticalLineTo(19f)
                curveTo(20f, 19.55f, 19.804f, 20.021f, 19.413f, 20.413f)
                curveTo(19.021f, 20.804f, 18.55f, 21f, 18f, 21f)
                horizontalLineTo(15f)
                curveTo(14.717f, 21f, 14.479f, 20.904f, 14.288f, 20.712f)
                curveTo(14.096f, 20.521f, 14f, 20.283f, 14f, 20f)
                verticalLineTo(15f)
                curveTo(14f, 14.717f, 13.904f, 14.479f, 13.712f, 14.288f)
                curveTo(13.521f, 14.096f, 13.283f, 14f, 13f, 14f)
                horizontalLineTo(11f)
                curveTo(10.717f, 14f, 10.479f, 14.096f, 10.288f, 14.288f)
                curveTo(10.096f, 14.479f, 10f, 14.717f, 10f, 15f)
                verticalLineTo(20f)
                curveTo(10f, 20.283f, 9.904f, 20.521f, 9.712f, 20.712f)
                curveTo(9.521f, 20.904f, 9.283f, 21f, 9f, 21f)
                horizontalLineTo(6f)
                curveTo(5.45f, 21f, 4.979f, 20.804f, 4.588f, 20.413f)
                curveTo(4.196f, 20.021f, 4f, 19.55f, 4f, 19f)
                close()
            }
        }.build()

        return _SelectedHome!!
    }

@Suppress("ObjectPropertyName")
private var _SelectedHome: ImageVector? = null
