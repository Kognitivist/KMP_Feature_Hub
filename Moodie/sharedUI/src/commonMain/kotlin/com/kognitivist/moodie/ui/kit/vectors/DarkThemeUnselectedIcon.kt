package com.kognitivist.moodie.ui.kit.vectors

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VectorRes.DarkThemeUnselectedIcon: ImageVector
    get() {
        if (_DarkThemeUnselectedIcon != null) {
            return _DarkThemeUnselectedIcon!!
        }
        _DarkThemeUnselectedIcon = ImageVector.Builder(
            name = "DarkThemeUnselectedIcon",
            defaultWidth = 30.dp,
            defaultHeight = 30.dp,
            viewportWidth = 30f,
            viewportHeight = 30f
        ).apply {
            path(fill = SolidColor(Color(0xFF725D78))) {
                moveTo(11.875f, 25f)
                curveTo(14.646f, 25f, 17.005f, 24.026f, 18.953f, 22.078f)
                curveTo(20.901f, 20.13f, 21.875f, 17.771f, 21.875f, 15f)
                curveTo(21.875f, 12.229f, 20.901f, 9.87f, 18.953f, 7.922f)
                curveTo(17.005f, 5.974f, 14.646f, 5f, 11.875f, 5f)
                horizontalLineTo(11.219f)
                curveTo(11.01f, 5f, 10.813f, 5.021f, 10.625f, 5.063f)
                curveTo(11.813f, 6.438f, 12.734f, 7.974f, 13.391f, 9.672f)
                curveTo(14.047f, 11.37f, 14.375f, 13.146f, 14.375f, 15f)
                curveTo(14.375f, 16.854f, 14.047f, 18.63f, 13.391f, 20.328f)
                curveTo(12.734f, 22.026f, 11.813f, 23.563f, 10.625f, 24.938f)
                curveTo(10.813f, 24.979f, 11.01f, 25f, 11.219f, 25f)
                horizontalLineTo(11.875f)
                close()
                moveTo(11.875f, 27.5f)
                curveTo(11.146f, 27.5f, 10.417f, 27.427f, 9.688f, 27.281f)
                curveTo(8.958f, 27.135f, 8.26f, 26.917f, 7.594f, 26.625f)
                curveTo(7.365f, 26.521f, 7.177f, 26.365f, 7.031f, 26.156f)
                curveTo(6.885f, 25.948f, 6.813f, 25.719f, 6.813f, 25.469f)
                curveTo(6.813f, 25.281f, 6.854f, 25.104f, 6.938f, 24.938f)
                curveTo(7.021f, 24.771f, 7.146f, 24.625f, 7.313f, 24.5f)
                curveTo(8.771f, 23.354f, 9.896f, 21.948f, 10.688f, 20.281f)
                curveTo(11.479f, 18.615f, 11.875f, 16.854f, 11.875f, 15f)
                curveTo(11.875f, 13.146f, 11.474f, 11.391f, 10.672f, 9.734f)
                curveTo(9.87f, 8.078f, 8.74f, 6.667f, 7.281f, 5.5f)
                curveTo(7.135f, 5.375f, 7.021f, 5.229f, 6.938f, 5.063f)
                curveTo(6.854f, 4.896f, 6.813f, 4.719f, 6.813f, 4.531f)
                curveTo(6.813f, 4.281f, 6.88f, 4.052f, 7.016f, 3.844f)
                curveTo(7.151f, 3.635f, 7.333f, 3.479f, 7.563f, 3.375f)
                curveTo(8.25f, 3.083f, 8.958f, 2.865f, 9.688f, 2.719f)
                curveTo(10.417f, 2.573f, 11.146f, 2.5f, 11.875f, 2.5f)
                curveTo(13.604f, 2.5f, 15.229f, 2.828f, 16.75f, 3.484f)
                curveTo(18.271f, 4.141f, 19.594f, 5.031f, 20.719f, 6.156f)
                curveTo(21.844f, 7.281f, 22.734f, 8.604f, 23.391f, 10.125f)
                curveTo(24.047f, 11.646f, 24.375f, 13.271f, 24.375f, 15f)
                curveTo(24.375f, 16.729f, 24.047f, 18.354f, 23.391f, 19.875f)
                curveTo(22.734f, 21.396f, 21.844f, 22.719f, 20.719f, 23.844f)
                curveTo(19.594f, 24.969f, 18.271f, 25.859f, 16.75f, 26.516f)
                curveTo(15.229f, 27.172f, 13.604f, 27.5f, 11.875f, 27.5f)
                close()
            }
        }.build()

        return _DarkThemeUnselectedIcon!!
    }

@Suppress("ObjectPropertyName")
private var _DarkThemeUnselectedIcon: ImageVector? = null
