package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.CollectionIcon: ImageVector
    get() {
        if (_CollectionIcon != null) {
            return _CollectionIcon!!
        }
        _CollectionIcon = ImageVector.Builder(
            name = "CollectionIcon",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f
        ).apply {
            path(fill = SolidColor(Color(0xFFB24F9C))) {
                moveTo(17.667f, 16.667f)
                lineTo(16.134f, 14.667f)
                curveTo(16f, 14.489f, 15.823f, 14.4f, 15.6f, 14.4f)
                curveTo(15.378f, 14.4f, 15.2f, 14.489f, 15.067f, 14.667f)
                lineTo(12.834f, 17.6f)
                curveTo(12.656f, 17.822f, 12.628f, 18.056f, 12.75f, 18.3f)
                curveTo(12.873f, 18.545f, 13.078f, 18.667f, 13.367f, 18.667f)
                horizontalLineTo(23.967f)
                curveTo(24.256f, 18.667f, 24.461f, 18.545f, 24.584f, 18.3f)
                curveTo(24.706f, 18.056f, 24.678f, 17.822f, 24.5f, 17.6f)
                lineTo(21.267f, 13.367f)
                curveTo(21.134f, 13.189f, 20.956f, 13.1f, 20.734f, 13.1f)
                curveTo(20.511f, 13.1f, 20.334f, 13.189f, 20.2f, 13.367f)
                lineTo(17.667f, 16.667f)
                close()
                moveTo(10.667f, 24f)
                curveTo(9.934f, 24f, 9.306f, 23.739f, 8.784f, 23.217f)
                curveTo(8.261f, 22.694f, 8f, 22.067f, 8f, 21.333f)
                verticalLineTo(5.333f)
                curveTo(8f, 4.6f, 8.261f, 3.972f, 8.784f, 3.45f)
                curveTo(9.306f, 2.928f, 9.934f, 2.667f, 10.667f, 2.667f)
                horizontalLineTo(26.667f)
                curveTo(27.4f, 2.667f, 28.028f, 2.928f, 28.55f, 3.45f)
                curveTo(29.073f, 3.972f, 29.334f, 4.6f, 29.334f, 5.333f)
                verticalLineTo(21.333f)
                curveTo(29.334f, 22.067f, 29.073f, 22.694f, 28.55f, 23.217f)
                curveTo(28.028f, 23.739f, 27.4f, 24f, 26.667f, 24f)
                horizontalLineTo(10.667f)
                close()
                moveTo(10.667f, 21.333f)
                horizontalLineTo(26.667f)
                verticalLineTo(5.333f)
                horizontalLineTo(10.667f)
                verticalLineTo(21.333f)
                close()
                moveTo(5.334f, 29.333f)
                curveTo(4.6f, 29.333f, 3.973f, 29.072f, 3.45f, 28.55f)
                curveTo(2.928f, 28.028f, 2.667f, 27.4f, 2.667f, 26.667f)
                verticalLineTo(9.333f)
                curveTo(2.667f, 8.956f, 2.795f, 8.639f, 3.05f, 8.383f)
                curveTo(3.306f, 8.128f, 3.623f, 8f, 4f, 8f)
                curveTo(4.378f, 8f, 4.695f, 8.128f, 4.95f, 8.383f)
                curveTo(5.206f, 8.639f, 5.334f, 8.956f, 5.334f, 9.333f)
                verticalLineTo(26.667f)
                horizontalLineTo(22.667f)
                curveTo(23.045f, 26.667f, 23.361f, 26.795f, 23.617f, 27.05f)
                curveTo(23.872f, 27.306f, 24f, 27.622f, 24f, 28f)
                curveTo(24f, 28.378f, 23.872f, 28.694f, 23.617f, 28.95f)
                curveTo(23.361f, 29.206f, 23.045f, 29.333f, 22.667f, 29.333f)
                horizontalLineTo(5.334f)
                close()
            }
        }.build()

        return _CollectionIcon!!
    }

@Suppress("ObjectPropertyName")
private var _CollectionIcon: ImageVector? = null
