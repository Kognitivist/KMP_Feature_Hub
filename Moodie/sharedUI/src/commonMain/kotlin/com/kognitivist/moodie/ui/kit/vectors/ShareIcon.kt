package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.ShareIcon: ImageVector
    get() {
        if (_ShareIcon != null) {
            return _ShareIcon!!
        }
        _ShareIcon = ImageVector.Builder(
            name = "ShareIcon",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f
        ).apply {
            path(fill = SolidColor(Color(0xFFB24F9C))) {
                moveTo(22.667f, 29.333f)
                curveTo(21.556f, 29.333f, 20.611f, 28.944f, 19.834f, 28.167f)
                curveTo(19.056f, 27.389f, 18.667f, 26.444f, 18.667f, 25.333f)
                curveTo(18.667f, 25.2f, 18.7f, 24.889f, 18.767f, 24.4f)
                lineTo(9.4f, 18.933f)
                curveTo(9.045f, 19.267f, 8.634f, 19.528f, 8.167f, 19.717f)
                curveTo(7.7f, 19.906f, 7.2f, 20f, 6.667f, 20f)
                curveTo(5.556f, 20f, 4.611f, 19.611f, 3.834f, 18.833f)
                curveTo(3.056f, 18.056f, 2.667f, 17.111f, 2.667f, 16f)
                curveTo(2.667f, 14.889f, 3.056f, 13.944f, 3.834f, 13.167f)
                curveTo(4.611f, 12.389f, 5.556f, 12f, 6.667f, 12f)
                curveTo(7.2f, 12f, 7.7f, 12.094f, 8.167f, 12.283f)
                curveTo(8.634f, 12.472f, 9.045f, 12.733f, 9.4f, 13.067f)
                lineTo(18.767f, 7.6f)
                curveTo(18.722f, 7.445f, 18.695f, 7.295f, 18.684f, 7.15f)
                curveTo(18.673f, 7.006f, 18.667f, 6.845f, 18.667f, 6.667f)
                curveTo(18.667f, 5.556f, 19.056f, 4.611f, 19.834f, 3.833f)
                curveTo(20.611f, 3.056f, 21.556f, 2.667f, 22.667f, 2.667f)
                curveTo(23.778f, 2.667f, 24.722f, 3.056f, 25.5f, 3.833f)
                curveTo(26.278f, 4.611f, 26.667f, 5.556f, 26.667f, 6.667f)
                curveTo(26.667f, 7.778f, 26.278f, 8.722f, 25.5f, 9.5f)
                curveTo(24.722f, 10.278f, 23.778f, 10.667f, 22.667f, 10.667f)
                curveTo(22.134f, 10.667f, 21.634f, 10.572f, 21.167f, 10.383f)
                curveTo(20.7f, 10.194f, 20.289f, 9.933f, 19.934f, 9.6f)
                lineTo(10.567f, 15.067f)
                curveTo(10.611f, 15.222f, 10.639f, 15.372f, 10.65f, 15.517f)
                curveTo(10.661f, 15.661f, 10.667f, 15.822f, 10.667f, 16f)
                curveTo(10.667f, 16.178f, 10.661f, 16.339f, 10.65f, 16.483f)
                curveTo(10.639f, 16.628f, 10.611f, 16.778f, 10.567f, 16.933f)
                lineTo(19.934f, 22.4f)
                curveTo(20.289f, 22.067f, 20.7f, 21.806f, 21.167f, 21.617f)
                curveTo(21.634f, 21.428f, 22.134f, 21.333f, 22.667f, 21.333f)
                curveTo(23.778f, 21.333f, 24.722f, 21.722f, 25.5f, 22.5f)
                curveTo(26.278f, 23.278f, 26.667f, 24.222f, 26.667f, 25.333f)
                curveTo(26.667f, 26.444f, 26.278f, 27.389f, 25.5f, 28.167f)
                curveTo(24.722f, 28.944f, 23.778f, 29.333f, 22.667f, 29.333f)
                close()
                moveTo(22.667f, 26.667f)
                curveTo(23.045f, 26.667f, 23.361f, 26.539f, 23.617f, 26.283f)
                curveTo(23.872f, 26.028f, 24f, 25.711f, 24f, 25.333f)
                curveTo(24f, 24.956f, 23.872f, 24.639f, 23.617f, 24.383f)
                curveTo(23.361f, 24.128f, 23.045f, 24f, 22.667f, 24f)
                curveTo(22.289f, 24f, 21.972f, 24.128f, 21.717f, 24.383f)
                curveTo(21.461f, 24.639f, 21.334f, 24.956f, 21.334f, 25.333f)
                curveTo(21.334f, 25.711f, 21.461f, 26.028f, 21.717f, 26.283f)
                curveTo(21.972f, 26.539f, 22.289f, 26.667f, 22.667f, 26.667f)
                close()
                moveTo(6.667f, 17.333f)
                curveTo(7.045f, 17.333f, 7.361f, 17.206f, 7.617f, 16.95f)
                curveTo(7.873f, 16.694f, 8f, 16.378f, 8f, 16f)
                curveTo(8f, 15.622f, 7.873f, 15.306f, 7.617f, 15.05f)
                curveTo(7.361f, 14.795f, 7.045f, 14.667f, 6.667f, 14.667f)
                curveTo(6.289f, 14.667f, 5.973f, 14.795f, 5.717f, 15.05f)
                curveTo(5.461f, 15.306f, 5.334f, 15.622f, 5.334f, 16f)
                curveTo(5.334f, 16.378f, 5.461f, 16.694f, 5.717f, 16.95f)
                curveTo(5.973f, 17.206f, 6.289f, 17.333f, 6.667f, 17.333f)
                close()
                moveTo(23.617f, 7.617f)
                curveTo(23.872f, 7.361f, 24f, 7.045f, 24f, 6.667f)
                curveTo(24f, 6.289f, 23.872f, 5.972f, 23.617f, 5.717f)
                curveTo(23.361f, 5.461f, 23.045f, 5.333f, 22.667f, 5.333f)
                curveTo(22.289f, 5.333f, 21.972f, 5.461f, 21.717f, 5.717f)
                curveTo(21.461f, 5.972f, 21.334f, 6.289f, 21.334f, 6.667f)
                curveTo(21.334f, 7.045f, 21.461f, 7.361f, 21.717f, 7.617f)
                curveTo(21.972f, 7.872f, 22.289f, 8f, 22.667f, 8f)
                curveTo(23.045f, 8f, 23.361f, 7.872f, 23.617f, 7.617f)
                close()
            }
        }.build()

        return _ShareIcon!!
    }

@Suppress("ObjectPropertyName")
private var _ShareIcon: ImageVector? = null
