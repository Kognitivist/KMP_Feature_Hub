package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.CreateNoteIcon: ImageVector
    get() {
        if (_CreateNoteIcon != null) {
            return _CreateNoteIcon!!
        }
        _CreateNoteIcon = ImageVector.Builder(
            name = "CreateNoteIcon",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f
        ).apply {
            path(fill = SolidColor(Color(0xFFB24F9C))) {
                moveTo(16.333f, 14.433f)
                lineTo(17.567f, 15.667f)
                lineTo(24.8f, 8.433f)
                lineTo(23.567f, 7.2f)
                lineTo(16.333f, 14.433f)
                close()
                moveTo(6.667f, 25.333f)
                horizontalLineTo(7.9f)
                lineTo(15.667f, 17.567f)
                lineTo(14.433f, 16.333f)
                lineTo(6.667f, 24.1f)
                verticalLineTo(25.333f)
                close()
                moveTo(18.5f, 18.5f)
                lineTo(13.5f, 13.5f)
                lineTo(19.067f, 7.933f)
                lineTo(18.1f, 6.967f)
                lineTo(11.733f, 13.333f)
                curveTo(11.467f, 13.6f, 11.156f, 13.733f, 10.8f, 13.733f)
                curveTo(10.444f, 13.733f, 10.133f, 13.6f, 9.867f, 13.333f)
                curveTo(9.6f, 13.067f, 9.467f, 12.75f, 9.467f, 12.383f)
                curveTo(9.467f, 12.017f, 9.6f, 11.7f, 9.867f, 11.433f)
                lineTo(16.2f, 5.1f)
                curveTo(16.733f, 4.567f, 17.361f, 4.3f, 18.083f, 4.3f)
                curveTo(18.806f, 4.3f, 19.433f, 4.567f, 19.967f, 5.1f)
                lineTo(20.933f, 6.067f)
                lineTo(22.6f, 4.4f)
                curveTo(22.867f, 4.133f, 23.183f, 4f, 23.55f, 4f)
                curveTo(23.917f, 4f, 24.233f, 4.133f, 24.5f, 4.4f)
                lineTo(27.6f, 7.5f)
                curveTo(27.867f, 7.767f, 28f, 8.083f, 28f, 8.45f)
                curveTo(28f, 8.817f, 27.867f, 9.133f, 27.6f, 9.4f)
                lineTo(18.5f, 18.5f)
                close()
                moveTo(5.333f, 28f)
                curveTo(4.956f, 28f, 4.639f, 27.872f, 4.383f, 27.617f)
                curveTo(4.128f, 27.361f, 4f, 27.044f, 4f, 26.667f)
                verticalLineTo(24.1f)
                curveTo(4f, 23.744f, 4.067f, 23.406f, 4.2f, 23.083f)
                curveTo(4.333f, 22.761f, 4.522f, 22.478f, 4.767f, 22.233f)
                lineTo(13.5f, 13.5f)
                lineTo(18.5f, 18.5f)
                lineTo(9.767f, 27.233f)
                curveTo(9.522f, 27.478f, 9.239f, 27.667f, 8.917f, 27.8f)
                curveTo(8.594f, 27.933f, 8.256f, 28f, 7.9f, 28f)
                horizontalLineTo(5.333f)
                close()
            }
        }.build()

        return _CreateNoteIcon!!
    }

@Suppress("ObjectPropertyName")
private var _CreateNoteIcon: ImageVector? = null
